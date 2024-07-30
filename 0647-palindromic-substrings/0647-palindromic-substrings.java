class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;
        // Generate all substring
        for(int i=0; i<n; i++)
        {
            for(int j=i; j<n; j++)
            {
                if(isPalindrome(s,i,j))
                {
                    count++;
                }
            }
        }
        return count;
    }
    public boolean isPalindrome(String s, int start, int end)
    {
        while(start < end)
        {
            if(s.charAt(start) != s.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}