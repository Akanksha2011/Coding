class Solution {
    public String addBinary(String a, String b) {
      StringBuilder res = new StringBuilder();
      int i = a.length()-1;
      int j = b.length()-1;
       int carry = 0;
       while(i >= 0 || j >= 0 || carry > 0)
       {
           int sum = carry;
           if(i >= 0)
           {
              sum = sum + a.charAt(i--) - '0';
           }
           if(j >= 0)
           {
              sum = sum + b.charAt(j--) - '0';
           }
           res.insert(0, sum%2);
           carry = sum/2;
       }
       return res.toString();
    }
}