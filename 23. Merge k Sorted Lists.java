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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null || list2 == null ) return list1 !=null ? list1:list2;
        
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        
        ListNode p1 = list1;
        ListNode p2 = list2;
        
        while(p1 != null && p2 != null){
            if(p1.val<p2.val){
                prev.next = p1;
                p1 = p1.next;
            }else{
                prev.next = p2;
                p2 = p2.next;
            }
            prev = prev.next;
        }
        prev.next = p1 != null ? p1 :p2;
        return dummy.next;
        
    }
    
    public ListNode mergeKLists(ListNode[] lists,int si, int end) {
        if(si>end) return null;
        if(si == end) return lists[si];
        int mid = (si+end)/2;
        
        ListNode l1 = mergeKLists(lists,si,mid);
        ListNode l2 = mergeKLists(lists,mid+1,end);
        return mergeTwoLists(l1,l2);
    }    
    
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        return mergeKLists(lists,0,lists.length-1);
    }
}
