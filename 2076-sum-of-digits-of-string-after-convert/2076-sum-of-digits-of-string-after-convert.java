class Solution {
    public int getLucky(String s, int k) {
        StringBuilder numstr = new StringBuilder();
        for(char ch : s.toCharArray())
        {
            int val = ch - 'a' + 1;
            numstr.append(val);
        }
        int sum = sumOfDigits(numstr.toString());

        for(int i=1; i<k; i++)
        {
            sum = sumOfDigits(String.valueOf(sum));
        }
        return sum;
    }

    private int sumOfDigits(String numstr)
    {
        int sum = 0;
        for(char ch : numstr.toCharArray())
        {
            sum += ch-'0';
        }
        return sum;
    }
}