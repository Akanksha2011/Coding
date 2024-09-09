class Solution {
    public boolean canConstruct(String ransom, String mag) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<mag.length(); i++)
        {
            map.put(mag.charAt(i),map.getOrDefault(mag.charAt(i),0)+1);
        }
        for(int i=0; i<ransom.length();i++)
        {   
            if(!map.containsKey(ransom.charAt(i)))
            return false;
            else
            {
                map.put(ransom.charAt(i),map.get(ransom.charAt(i))-1);
                if(map.get(ransom.charAt(i)) == 0)
                map.remove(ransom.charAt(i));
            }
        }
        return true;
    }
}