class Solution {
    public boolean canConstruct(String ransom, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<magazine.length(); i++)
        {
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        for(int i=0; i<ransom.length(); i++)
        {
           if(map.containsKey(ransom.charAt(i)))
           {
               map.put(ransom.charAt(i), map.get(ransom.charAt(i)) - 1);
                if (map.get(ransom.charAt(i)) == 0) {
                    map.remove(ransom.charAt(i));
           }
           }
           else
           return false;
        }
        return true;
    }
}