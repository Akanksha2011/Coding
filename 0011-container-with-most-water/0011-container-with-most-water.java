class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int currArea = 0;
        int maxArea = 0;
        while(left < right)
        {
            currArea = (right - left) * Math.min(height[left],height[right]);
            maxArea = Math.max(currArea, maxArea);
            if(height[left] < height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return maxArea;
    }
}