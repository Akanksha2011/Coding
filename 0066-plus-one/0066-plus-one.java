class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i>=0; i--)
        {
            if(digits[i] < 9)
            {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;       
        }
        int[] numbers = new int[digits.length + 1];
        numbers[0] = 1;
        return numbers;
    }
}