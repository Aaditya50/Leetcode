/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int[] arr = new int[2];
        inOrder(root,arr,k);
        return arr[1];
    }
    public void inOrder(TreeNode root,int[] arr , int  k){
        
        if(root == null) return ;
        inOrder(root.left,arr,k);
        if(++arr[0] == k){
            arr[1] = root.val;
            return;
        }
        inOrder(root.right,arr,k);
    }
}
