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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int le = diameterOfBinaryTree(root.left);
        int ri = diameterOfBinaryTree(root.right);
        int f = height(root.left)+height(root.right)+2;
        return Math.max(f,Math.max(le,ri));
    }
    
    public static int height(TreeNode node){
        if(node==null) return -1;
        int le = height(node.left);
        int ri = height(node.right);
        return Math.max(le,ri)+1;
    }
}
