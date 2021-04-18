package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/**
 * Search Suggestions System
 */
public class s1268 {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Trie trie = new Trie();
        for (String product : products) {
            Trie node = trie;
            for (char c : product.toCharArray()) {
                if (node.children[c - 'a'] == null)
                    node.children[c - 'a'] = new Trie();
                node = node.children[c - 'a'];
                node.suggestions.add(product);
                if (node.suggestions.size() > 3)
                    node.suggestions.pollLast();
            }
        }
        List<List<String>> r = new ArrayList<>(searchWord.length());
        for (char c : searchWord.toCharArray()) {
            if (trie != null)
                trie = trie.children[c - 'a'];
            r.add(trie != null ? new ArrayList<>(trie.suggestions) : Collections.emptyList());
        }
        return r;
    }

    class Trie {
        TreeSet<String> suggestions = new TreeSet<>();
        Trie[] children = new Trie[26];
    }
}