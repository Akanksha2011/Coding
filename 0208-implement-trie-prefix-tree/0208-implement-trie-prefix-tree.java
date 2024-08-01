class Trie {
    Trie[] child;
    boolean eow;

    public Trie() {
        child = new Trie[26];
        for(int i=0; i<26; i++)
        {
            child[i] = null;
        }
        eow = false;
    }
    
    public void insert(String word) {
       Trie root = this;
        for(int i=0; i<word.length(); i++)
        {
            int idx = word.charAt(i)-'a';
            if(root.child[idx] == null)
            {
                root.child[idx] = new Trie();
            }
            if(i == word.length()-1)
            {
                root.child[idx].eow = true;
            }
            root = root.child[idx];
        }
     /*    Trie root = this;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (root.child[idx] == null) {
                root.child[idx] = new Trie();
            }
            root = root.child[idx];
        }
        root.eow = true;*/
    }
    
    public boolean search(String word) {
        Trie root = this;
        for(int i=0; i<word.length();i++)
        {
            int idx = word.charAt(i)-'a';
            if(root.child[idx] == null)
            {
                return false;
            }
            if(i == word.length()-1 && root.child[idx].eow == false)
            {
                return false;
            }
            root = root.child[idx];
        }
        return true;
    }
    
    public boolean startsWith(String prefix) {
        Trie root = this;
        for(int i=0; i<prefix.length();i++)
        {
            int idx = prefix.charAt(i) - 'a';
            if(root.child[idx] == null)
            {
                return false;
            }
            root = root.child[idx];
        } 
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */