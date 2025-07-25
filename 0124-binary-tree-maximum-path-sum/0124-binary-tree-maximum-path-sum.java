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
    int maxSum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root){
        if(root==null){
            return 0;
        }
        helper(root);
        return maxSum;
    }
    public int helper(TreeNode node){
        if(node==null){
            return 0;
        }
        // to check it is not negative:
        int leftMax=Math.max(0,helper(node.left));
        int rightMax=Math.max(0,helper(node.right));

        maxSum=Math.max(maxSum,node.val+leftMax+rightMax);
        return node.val+Math.max(leftMax,rightMax);
    }
}