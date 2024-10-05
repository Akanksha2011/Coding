class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();

        if(len1 > len2)
        return false;

        int[] s1freq = new int[26];
        int[] s2freq = new int[26];

        for(int i=0; i<len1; i++)
        {
            s1freq[s1.charAt(i) - 'a']++;
            s2freq[s2.charAt(i) - 'a']++;
        }
        for(int i=0; i<len2-len1; i++)
        {
            if(matches(s1freq,s2freq))
            {
                return true;
            }
            s2freq[s2.charAt(i) - 'a']--;
            s2freq[s2.charAt(i+len1)- 'a']++;
        }
        return matches(s1freq, s2freq);
    }
    private boolean matches(int[] s1Freq, int[] s2Freq) {
        for (int i = 0; i < 26; i++) {
            if (s1Freq[i] != s2Freq[i]) return false;
        }
        return true;
    }
}