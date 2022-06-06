/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode ans1 = headA;
        ListNode ans2 = headB;
        
        while(ans1 != ans2){
            ans1 = ans1 == null ? headB : ans1.next;
            ans2 = ans2 == null ? headA : ans2.next;
        }
        return ans1;
    }
}
