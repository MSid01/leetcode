package problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class s1178 {
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        Trie trie = new Trie();
        for (String w : words) {
            boolean[] letters = toLetters(w);
            Trie node = trie;
            for (int i = 0; i < letters.length; i++)
                if (letters[i])
                    node = node.children[i] == null ? (node.children[i] = new Trie()) : node.children[i];
            node.n++;
        }
        return Arrays.stream(puzzles).map(p -> count(trie, p.charAt(0) - 'a', toLetters(p), new boolean[26])).collect(Collectors.toList());
    }

    int count(Trie node, int puzzleFirstLetter, boolean[] puzzleLetters, boolean[] wordLetters) {
        int count = wordLetters[puzzleFirstLetter] ? node.n : 0;
        for (int i = 0; i < node.children.length; i++)
            if (node.children[i] != null && puzzleLetters[i]) {
                wordLetters[i] = true;
                count += count(node.children[i], puzzleFirstLetter, puzzleLetters, wordLetters);
                wordLetters[i] = false;
            }
        return count;
    }

    boolean[] toLetters(String w) {
        boolean[] letters = new boolean[26];
        w.chars().forEach(c -> letters[c - 'a'] = true);
        return letters;
    }

    class Trie {
        final Trie[] children = new Trie[26];
        int n;
    }
}