class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        HashSet<Character> h = new HashSet<>();
        int left = 0;
        for(int right = 0; right<n; right++)
        {
            if(! h.contains(s.charAt(right)))
            {
                h.add(s.charAt(right));
                maxLength = Math.max(maxLength, right-left+1);
            }
            else
            {
                while(h.contains(s.charAt(right)))
                {
                    h.remove(s.charAt(left));
                    left++;
                }
                h.add(s.charAt(right));
                maxLength = Math.max(maxLength, right-left+1);
            }
        }
        return maxLength;
    }
}