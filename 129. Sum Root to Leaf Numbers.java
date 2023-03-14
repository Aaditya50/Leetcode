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
    int ans=0;
    public int sumNumbers(TreeNode root) {
       if(root==null) return 0;
       int value=0;
       roottoleaf(root,value);
       return ans; 
    }
    public void roottoleaf(TreeNode root,int value){
        if(root==null) return;
        value *= 10;
        value += root.val;
        if(root.left==null && root.right==null){
            ans+=value;
        }
        roottoleaf(root.left,value);
        roottoleaf(root.right,value);
    }

}
