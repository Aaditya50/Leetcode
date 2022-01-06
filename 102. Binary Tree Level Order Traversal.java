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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> r = new ArrayList<>();
        if(root == null) return r;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        
        while(q.size() > 0){
            int count = q.size();
            List<Integer> cq = new ArrayList<>();
            for(int i=0;i<count;i++){
                TreeNode node = q.remove();
                cq.add(node.val);
                if(node.left != null){
                    q.add(node.left);
                }
                
                if(node.right != null){
                    q.add(node.right);
                }
            }
            r.add(cq);
        }
        return r;
            
    }
}

/*

Revice the question after 10 days all tree question 
Accepted
Runtime: 0 ms
Your input
[3,9,20,null,null,15,7]
Output
[[3],[9,20],[15,7]]
Expected
[[3],[9,20],[15,7]]
*/
