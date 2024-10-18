class Solution {
    public List<Integer> majorityElement(int[] nums) {
       int ele1 = Integer.MIN_VALUE;
       int ele2 = Integer.MIN_VALUE;
       int n = nums.length;
       int cnt1 = 0;
       int cnt2 = 0;
       for(int num : nums)
       {
          if(num == ele1)
          {
            cnt1++;
          }
          else if(num == ele2)
          {
            cnt2++;
          }
          else if(cnt1 == 0)
          {
            ele1 = num;
            cnt1 = 1;
          }
          else if(cnt2 == 0)
          {
            ele2 = num;
            cnt2 = 1;
          }
          else
          {
            cnt1--;
            cnt2--;
          }
       }
       cnt1 = 0;
       cnt2 = 0;
       for(int num : nums)
       {
          if(num == ele1)
          {
            cnt1++;
          }
          else if(num == ele2)
          {
            cnt2++;
          }
       }
List<Integer> res = new ArrayList<>();
int threshold = n/3;
 if(cnt1 > threshold)
 {
    res.add(ele1);
 }
 if(cnt2 > threshold && ele2 != ele1)
 {
    res.add(ele2);
 }
 return res;
    }
}