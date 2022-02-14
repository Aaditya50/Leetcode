class Solution {
    
    public int maxDepth(TreeNode root) {
        int lh = 0 , rh = 0;
        if(root == null) return 0;
        lh = 1+ maxDepth(root.left);
        rh = 1+ maxDepth(root.right);
        return lh>rh ? lh:rh;
    }
}
