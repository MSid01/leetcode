package problems;

/**
 * Verbal Arithmetic Puzzle
 */
public class s1307 {
    public boolean isSolvable(String[] words, String result) {
        boolean[] letters = new boolean[26], starts = new boolean[26];
        char[][] cWords = new char[words.length][];
        for (int i = 0; i < words.length; i++) {
            cWords[i] = words[i].toCharArray();
            if (cWords[i].length > 1)
                starts[cWords[i][0] - 'A'] = true;
            for (char c : cWords[i])
                letters[c - 'A'] = true;
        }
        starts[result.charAt(0) - 'A'] = true;
        for (char c : result.toCharArray())
            letters[c - 'A'] = true;
        return solvable(cWords, result.toCharArray(), letters, new boolean[10], new int[26], starts);
    }

    boolean solvable(char[][] words, char[] result, boolean[] letters, boolean[] usedDigits, int[] m, boolean[] starts) {
        int useLetterIdx = -1;
        for (int i = 0; i < letters.length; i++)
            if (letters[i]) {
                letters[i] = false;
                useLetterIdx = i;
                break;
            }
        if (useLetterIdx == -1) {
            long sum = 0;
            for (char[] w : words)
                sum += toLong(w, m);
            return sum == toLong(result, m);
        }
        for (int i = 0; i < 10; i++)
            if (!usedDigits[i] && !(i == 0 && starts[useLetterIdx])) {
                m[useLetterIdx] = i;
                usedDigits[i] = true;
                if (solvable(words, result, letters, usedDigits, m, starts))
                    return true;
                m[useLetterIdx] = 0;
                usedDigits[i] = false;
            }
        letters[useLetterIdx] = true;
        return false;
    }

    long toLong(char[] w, int[] m) {
        long n = 0;
        for (char c : w)
            n = 10 * n + m[c - 'A'];
        return n;
    }
}