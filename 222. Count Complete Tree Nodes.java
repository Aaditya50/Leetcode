class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        int count1 = countNodes(root.left);
        int count2 = countNodes(root.right);
        return count1+count2+1;
    }
}
