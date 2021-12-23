/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next == null) return head;
        
        ListNode dummy = new ListNode(-(int)1e8);
        ListNode itr = dummy;
       
        ListNode curr = head;
        
        while(curr != null){
            while( curr != null && itr.val == curr.val){
                curr = curr.next;
            }
            
           itr.next = curr;
            itr = itr.next;
            
            if(curr != null ) curr = curr.next;
        }
        return dummy.next;
    }
}

/*
Your input: head = [-1,0,0,0,0,3,3]
Output: [-1,0,3]


Input: head = [1,1,2]
Output: [1,2]

Input: head = [1,1,2,3,3]
Output: [1,2,3]

*/
