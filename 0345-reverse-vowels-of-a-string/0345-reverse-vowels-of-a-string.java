class Solution {
    public String reverseVowels(String s) {
        // Convert the string to a character array to make modifications easier
        char[] charArray = s.toCharArray();
        // Define vowels
        String vowels = "aeiouAEIOU";
        
        int i = 0;
        int j = s.length() - 1;

         while(i<j)
         {
            while(i<j  && !vowels.contains(charArray[i] + ""))
            {
                i++;
            }
             while(i<j  && !vowels.contains(charArray[j] + ""))
            {
                j--;
            }
          //  if(i < j)
         //   {
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
                i++;
                j--;
          //  }
         }
         
        // Convert the character array back to a string and return
         return new String(charArray);
    }
}