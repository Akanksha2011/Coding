class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int currMax = 0;
        int currMin = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for(int num : nums)
        {
            totalSum += num;
            currMax = Math.max(currMax+num, num);
            maxSum = Math.max(maxSum,currMax);
            currMin = Math.min(currMin+num, num);
            minSum = Math.min(currMin, minSum);
        }
        if(maxSum < 0)
        return maxSum;
        return Math.max(maxSum, totalSum - minSum);
    }
}