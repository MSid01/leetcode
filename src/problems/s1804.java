package problems;

/**
 * Implement Trie II (Prefix Tree)
 */
public class s1804 {
    class Trie {
        int k, n;//k - number of instances, n - number of all strings, k<=n
        Trie[] children = new Trie[26];

        public void insert(String word) {
            Trie node = this;
            for (char c : word.toCharArray()) {
                if (node.children[c - 'a'] == null)
                    node.children[c - 'a'] = new Trie();
                node = node.children[c - 'a'];
                node.n++;
            }
            node.k++;
        }

        public int countWordsEqualTo(String word) { return find(word).k;}

        public int countWordsStartingWith(String prefix) {return find(prefix).n;}

        Trie find(String word) {
            Trie node = this;
            for (int i = 0; i < word.length() && node != null; i++)
                node = node.children[word.charAt(i) - 'a'];
            return node != null ? node : new Trie();
        }

        public void erase(String word) {
            Trie node = this;
            for (int i = 0; i < word.length(); i++, node.n--)
                node = node.children[word.charAt(i) - 'a'];
            node.k--;
        }
    }
}