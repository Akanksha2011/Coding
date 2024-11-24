/**/
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        rightView(root, ans, 0);
        return ans;
    }
    public void rightView(TreeNode root, List<Integer> ans, int currLevel)
    {   
        if(root == null)
        return;
        if(ans.size() == currLevel)
        {
            ans.add(root.val);
        }
        rightView(root.right, ans, currLevel+1);
        rightView(root.left, ans, currLevel+1);
    }
}