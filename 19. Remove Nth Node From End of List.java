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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       
        ListNode dummy_head = new ListNode(0);
        dummy_head.next = head;
        
        ListNode s = dummy_head;
        ListNode f = dummy_head;
        
        for(int i=0;i<n+1;i++){
            f = f.next;
        }
        
        while(f != null){
            f = f.next;
            s = s.next;
        }
        s.next = s.next.next;
        return dummy_head.next;
    }
}
