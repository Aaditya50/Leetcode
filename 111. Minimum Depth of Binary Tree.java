class Solution {
    public int minDepth(TreeNode root) {
        return help(root); 
    }
    public int help(TreeNode root){
        if(root==null) return 0;
        if(root.left == null && root.right==null) return 1;
        if(root.left == null) return (help(root.right)+1);
        if(root.right == null) return (help(root.left)+1);
        
        return Math.min(help(root.right),help(root.left))+1;
    }

}
