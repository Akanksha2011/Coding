class Solution {
    public int[] productExceptSelf(int[] nums) {
        int PP = 1;
        int SP = 1;
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0; i<n; i++)
        {
            ans[i] = PP;
            PP = PP * nums[i];
        }
        for(int i=n-1; i>=0; i--)
        {
            ans[i] = SP * ans[i];
            SP = SP * nums[i];
        }
        return ans;
    }
}