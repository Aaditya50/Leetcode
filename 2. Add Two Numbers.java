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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0 , carry = 0;
        ListNode head = new ListNode();
        ListNode temp = head;
        
        if(l1 == null || l2 == null) return null;
        
        while(l1 != null || l2 != null){
            if(l1 != null && l2 !=null){
                sum = l1.val+l2.val+carry;
                l1 = l1.next;
                l2 = l2.next;
            }else if( l1 != null && l2 == null){
                sum = l1.val+ carry;
                l1 = l1.next;
            }else{
                sum = l2.val + carry;
                l2 = l2.next;
            }
            carry = sum/10;
            temp.next = new ListNode(sum%10);
            temp = temp.next;
            
            
        }
        if(l1 == null && l2 == null && carry != 0){
                temp.next = new ListNode(carry);
            }
            return head.next;
    }
}

/*
Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
*/
