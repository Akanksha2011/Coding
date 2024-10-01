class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums ==  null || nums.length == 0)
        {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums)
        {
            set.add(num);
        }
        int maxLength = 0;
        for(int num : nums)
        {
            if(!set.contains(num-1))
            {
                int currNum = num;
                int currLength = 1;
                while(set.contains(currNum + 1))
                {
                    currNum++;
                    currLength++;
                }
                maxLength = Math.max(currLength, maxLength);
            }
        }
        return maxLength;
    }
}