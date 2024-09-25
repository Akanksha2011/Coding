class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> h = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        for(int i=0; i<n; i++)
        {
            if(!h.contains(s.charAt(i)))
            {
                h.add(s.charAt(i));
                maxLength = Math.max(maxLength,i-left+1);
            }

            else 
            {
                while(h.contains(s.charAt(i)))
                {
                    h.remove(s.charAt(left));
                    left++;
                }
                h.add(s.charAt(i));
                maxLength = Math.max(maxLength,i-left+1);
            }
        }
        return maxLength;
    }
}