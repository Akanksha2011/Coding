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
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> levelSums = new ArrayList<>();
        if(root == null)
        return -1;
        Queue<TreeNode> q = new LinkedList<>();  
         q.add(root);
        while(!q.isEmpty())
        {
            int sz = q.size();
            long currLevelSum = 0;

            for(int i=0; i<sz; i++)
            {
                TreeNode temp = q.poll();
                currLevelSum += temp.val;
                if(temp.left != null)
                {
                    q.add(temp.left);
                }
                if(temp.right != null)
                {
                    q.add(temp.right);
                }
            }
            levelSums.add(currLevelSum);
        }
        Collections.sort(levelSums, Collections.reverseOrder());

        if(k > levelSums.size())
        {
            return -1;
        }
      return levelSums.get(k-1);
    }
}