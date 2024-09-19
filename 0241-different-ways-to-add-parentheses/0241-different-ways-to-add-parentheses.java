class Solution {
    public List<Integer> diffWaysToCompute(String exp) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<exp.length(); i++)
        {
            char ch = exp.charAt(i);
            if(ch == '-' || ch == '+' || ch == '*')
            {
                String left = exp.substring(0,i);
                String right = exp.substring(i+1);
                List<Integer> leftAns = diffWaysToCompute(left);
                List<Integer> rightAns = diffWaysToCompute(right);
                for(int x : leftAns)
                {
                    for(int y : rightAns)
                    {
                        if(ch == '+')
                        {
                            ans.add(x + y);
                        }
                        else if(ch == '-')
                        {
                            ans.add(x - y);
                        }
                        else
                        {
                            ans.add(x*y);
                        }
                    }
                }
            }
        }
        if(ans.size() == 0) ans.add(Integer.parseInt(exp));
        return ans;
    }
}