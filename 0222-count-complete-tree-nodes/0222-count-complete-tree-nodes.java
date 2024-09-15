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
    public int countNodes(TreeNode root) {
        int lnodes = 0;
        int rnodes = 0;
        if(root == null)
        return 0;
        if(root.left != null)
        {
             lnodes = countNodes(root.left);
        }
         if(root.right != null)
        {
         rnodes = countNodes(root.right);
        }
        return rnodes + lnodes +1;
    }
}