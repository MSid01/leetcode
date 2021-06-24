package problems;

/**
 * Implement Trie (Prefix Tree)
 */
public class s208 {
    class Trie {
        Trie[] children = new Trie[26];
        boolean word;

        public void insert(String w) {
            Trie node = this;
            for (char c : w.toCharArray())
                node = (node.children[c - 'a'] = node.children[c - 'a'] == null ? new Trie() : node.children[c - 'a']);
            node.word = true;
        }

        public boolean search(String w) {
            Trie node = find(w);
            return node != null && node.word;
        }

        public boolean startsWith(String prefix) { return find(prefix) != null;}

        Trie find(String w) {
            Trie node = this;
            for (int i = 0; i < w.length() && node != null; node = node.children[w.charAt(i) - 'a'], i++) ;
            return node;
        }
    }
}