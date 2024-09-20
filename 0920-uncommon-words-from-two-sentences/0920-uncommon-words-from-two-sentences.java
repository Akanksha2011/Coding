class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String combined = s1 + " " + s2;
        String[] words = combined.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(String word : words)
        {
            map.put(word,map.getOrDefault(word,0)+1);
        }
        // Collect words that appear only once

        List<String> res = new ArrayList<>();
        for(String word : words)
        {
            if(map.get(word)==1)
            res.add(word);
        }
        return res.toArray(new String[0]);
    }
}