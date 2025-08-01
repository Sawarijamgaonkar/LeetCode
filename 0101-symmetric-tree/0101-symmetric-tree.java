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
    // public boolean isSymmetric(TreeNode root) {
    //     return isMirror(root.left,root.right);

    // }
    // public boolean isMirror(TreeNode n1, TreeNode n2){
    //     if(n1==null && n2==null){
    //         return true;
    //     }
    //     if(n1==null || n2==null){
    //         return false;
    //     }
    //     return n1.val==n2.val && isMirror(n1.left,n2.right) && isMirror(n1.right,n2.left);
    // }
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return isMirror(root.left,root.right);
    }
    public boolean isMirror(TreeNode x, TreeNode y){
        if(x==null && y==null){
            return true;
        }
        if(x==null || y==null){
            return false;
        }
        return x.val==y.val && isMirror(x.left, y.right) && isMirror(x.right,y.left);
    }

}