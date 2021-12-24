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
    static ListNode th = null;
    static ListNode tt = null;
    
    public static int length(ListNode node){
        ListNode curr = node;
        int len = 0;
        while(curr != null){
            curr = curr.next;
            len++;
        }
        return len;
    }
    
     public static void addFirst(ListNode node){
        if(th == null){
            th = node;
            tt = node;
        }else{
            node.next = th;
            th = node;
        }
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        ListNode oh = null, ot = null;
        int len = length(head);
        ListNode curr = head;
        while(len>=k){
            int tempk = k;
            while(tempk-- >0){
            ListNode temp = curr.next;
            curr.next = th ; 
            addFirst(curr);
            curr = temp;
        }
        if(oh == null){
            oh = th ;
            ot = tt;
        }else{
            ot.next = th;
            ot = tt;
        }
        th = null;
        tt = null;
        len -= k;
        }
        ot.next = curr;
        return oh;
        
    }
}

/*
Input: head = [1,2,3,4,5], k = 2
Output: [2,1,4,3,5]

Input: head = [1,2,3,4,5], k = 3
Output: [3,2,1,4,5]
*/
