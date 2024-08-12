class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backtrack(s,0,new ArrayList<>(),res);
        return res;
    }
    private void backtrack(String s, int start, List<String> currList, List<List<String>> res)
    {
          if(start == s.length())
          {
            res.add(new ArrayList<>(currList));
            return;
          }
          for(int i = start; i<s.length(); i++)
          {
            if(isPalindrome(s,start,i))
            {
                currList.add(s.substring(start,i+1));
                backtrack(s,i+1,currList,res);
                currList.remove(currList.size()-1);
            }
          }
    }
    private boolean isPalindrome(String s, int low, int high)
    {
        while(low < high)
        {
            if(s.charAt(low) != s.charAt(high))
            {
                return false;
            }
            low ++;
            high --;
        }
        return true;
    }
}