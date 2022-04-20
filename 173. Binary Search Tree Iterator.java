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
class BSTIterator {
    Stack<TreeNode> ans = new Stack<>();
    public BSTIterator(TreeNode root) {
        addAll(root);
    }
    
    private void addAll(TreeNode node){
        while(node != null){
            ans.push(node);
            node=node.left;
        }
    }
    
    public int next() {
        TreeNode top = ans.pop();
        addAll(top.right);
        return top.val;
    }
    
    public boolean hasNext() {
        return !ans.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
