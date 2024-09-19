class Solution {
    public String largestNumber(int[] nums) {
          String[] numStrings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrings[i] = String.valueOf(nums[i]);
        }

        // Step 2: Sort the array of strings using a custom comparator
        Arrays.sort(numStrings, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // Compare concatenated results: (a + b) vs (b + a)
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1); // Descending order
            }
        });

        // Step 3: Handle the case where the numbers are all zeros
        if (numStrings[0].equals("0")) {
            return "0";
        }

        // Step 4: Join all the strings in the sorted order to form the largest number
        StringBuilder ans = new StringBuilder();
        for (String num : numStrings) {
            ans.append(num);
        }

        return ans.toString();
    }
}