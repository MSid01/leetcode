package problems;

import java.util.*;

/**
 * Index Pairs of a String
 */
public class s1065 {
    public int[][] indexPairs1(String text, String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));
        List<int[]> pairs = new LinkedList<>();
        for (int i = 0; i < text.length(); i++)
            for (String w : words)
                if (text.startsWith(w, i))
                    pairs.add(new int[]{i, i + w.length() - 1});
        return pairs.toArray(new int[0][]);
    }

    public int[][] indexPairs(String text, String[] words) {
        Trie trie = new Trie();
        for (String w : words) {
            Trie node = trie;
            for (char c : w.toCharArray()) {
                if (node.nodes[c - 'a'] == null)
                    node.nodes[c - 'a'] = new Trie();
                node = node.nodes[c - 'a'];
            }
            node.word = true;
        }
        List<int[]> pairs = new ArrayList<>(words.length);
        for (int i = 0, j = i; i < text.length(); i++, j = i) {
            Trie node = trie.nodes[text.charAt(j) - 'a'];
            while (node != null) {
                if (node.word)
                    pairs.add(new int[]{i, j});
                node = j + 1 < text.length() ? node.nodes[text.charAt(++j) - 'a'] : null;
            }
        }
        return pairs.toArray(new int[0][]);
    }

    class Trie {
        Trie[] nodes = new Trie[26];
        boolean word = false;
    }
}
