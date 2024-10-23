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
    public TreeNode replaceValueInTree(TreeNode root) {
        if(root == null)
        {
            return null;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        root.val = 0;

        while(! q.isEmpty())
        {
            int levelSize = q.size();
            List<TreeNode> currLevelNodes = new ArrayList<>();
            int totalSum = 0;
            for(int i=0; i<levelSize; i++)
            {
                TreeNode node = q.poll();
                currLevelNodes.add(node);

                if(node.left != null)
                {
                    totalSum += node.left.val;
                    q.offer(node.left);
                }
                if(node.right != null)
                {
                    totalSum += node.right.val;
                    q.offer(node.right);
                }
            }

            for(TreeNode node : currLevelNodes)
            {
                int siblingSum = 0;

                if(node.left != null)
                {
                    siblingSum += node.left.val;
                }
                if(node.right != null)
                {
                    siblingSum += node.right.val;
                }

                if(node.left != null)
                {
                    node.left.val = totalSum - siblingSum;
                }
                if(node.right != null)
                {
                    node.right.val = totalSum - siblingSum;
                }
            }
        }
       return root; 
    }
}