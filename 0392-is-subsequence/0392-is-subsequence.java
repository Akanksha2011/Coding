class Solution {
    public boolean isSubsequence(String s, String t) {
        int count = 0;
        for(int i=0; count < s.length() && i<t.length(); i++)
        {
            if(s.charAt(count) == t.charAt(i))
            {
                count++;
            }
        }
        return count == s.length();
    }
}