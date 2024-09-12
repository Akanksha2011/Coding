class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for(int i=0; i<nums.length; i++)
        {
            map.put(nums[i],i);
        }
        for(int i=0; i<nums.length; i++)
        {
            int temp = target - nums[i];
            if(map.containsKey(temp) && i != map.get(temp))
            {
              ans[0] = i;
              ans[1] = map.get(temp);
            }
        }
        return ans;
    }
}