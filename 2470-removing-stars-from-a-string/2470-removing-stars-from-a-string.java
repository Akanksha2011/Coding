class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray())
        {
            if(ch == '*')
            {
                if(!st.isEmpty())
                {
                    st.pop();
                }
            }
            else
            {
                st.push(ch);
            }
        }
        StringBuilder res = new StringBuilder();
        for(char ch : st)
        {
            res.append(ch);
        }
        return res.toString();
    }
}