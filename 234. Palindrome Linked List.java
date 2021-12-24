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
    private boolean isH(ListNode right){
        if(right == null) return true;
        
        boolean rres = isH(right.next);
        if(rres == false){
            return false;
        }else if(pleft.val != right.val){
            return false;
        }else{
            pleft = pleft.next;
            return true;
        }
    }
    static ListNode pleft;
    public boolean isPalindrome(ListNode head) {
        pleft = head;
        return isH(head);
        
    }
}


/*
Example 1:


Input: head = [1,2,2,1]
Output: true
Example 2:


Input: head = [1,2]
Output: false

*/
