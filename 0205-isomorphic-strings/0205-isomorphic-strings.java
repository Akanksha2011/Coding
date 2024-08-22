class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
        return false;
        HashMap<Character,Character> map = new HashMap<>();
        HashMap<Character,Character> m = new HashMap<>();
        for(int i=0; i<s.length(); i++)
        {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(map.containsKey(a))
            {
                if(map.get(a) != b)
                return false;
            }
                else
                {
                    map.put(a,b);
                }
            if(m.containsKey(b))
            {
                if(m.get(b) != a)
                return false;
            }
            else
            m.put(b,a);     
        }
        return true;
    }
}