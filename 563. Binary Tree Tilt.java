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
    public int findTilt(TreeNode root) {
        if(root==null) return 0;
        int le = findTilt(root.left);
        int ri = findTilt(root.right);
        int lo = Math.abs(height(root.left)-height(root.right));
        return le+ri+lo;
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        return root.val + height(root.left) + height(root.right);
    }
}
