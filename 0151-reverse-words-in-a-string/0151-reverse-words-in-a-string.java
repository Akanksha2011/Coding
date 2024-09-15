class Solution {
    public String reverseWords(String s) {
         String[] t = s.trim().split("\s++");
        StringBuilder reversed = new StringBuilder();
        for(int i=t.length-1; i>=0; i--)
        {
            reversed.append(t[i]);
            if(i != 0)
            {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}