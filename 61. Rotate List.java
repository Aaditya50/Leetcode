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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) return head;
        ListNode dummy = head;
        int size = 0;
        while(dummy != null){
            dummy = dummy.next;
            size++;
        }
        
        System.out.println(size);
        k=k%size;
        if(k==0) return head;
        dummy=head;
        ListNode ans = head;
        for(int i=0;i<k;i++){
            ans = ans.next;
        }
        while(ans.next != null){
            dummy = dummy.next;
            ans = ans.next;
        }
        ListNode res = dummy.next;
        dummy.next = null;
        ans.next = head;
        
        return res;
    }
}
