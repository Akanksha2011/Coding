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
    private int minDiff = Integer.MAX_VALUE;
    private TreeNode prevNode = null;
    public int getMinimumDifference(TreeNode root) {
        inOrderTraversal(root);
        return minDiff;
    }
    private void inOrderTraversal(TreeNode root)
    {
        if(root == null)
        return;
        inOrderTraversal(root.left);
        if(prevNode != null)
        {
            minDiff = Math.min(minDiff, Math.abs(root.val - prevNode.val));
        }
        prevNode = root;
        inOrderTraversal(root.right);
    }
    
}