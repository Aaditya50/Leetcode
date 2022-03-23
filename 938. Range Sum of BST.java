class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        if(root == null) return 0;
        if(low > root.val){
            return rangeSumBST(root.right,low,high);
        }else if( high < root.val){
           return rangeSumBST(root.left,low,high);
        }else{
        return root.val+ rangeSumBST(root.left,low,high)+ rangeSumBST(root.right,low,high);    
        }
    }
}
