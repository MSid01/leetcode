package problems;

/**
 * Find Words That Can Be Formed by Characters
 */
public class s1160 {
    public int countCharacters(String[] words, String chars) {
        int c1[] = count(chars), len = 0;
        for (String w : words)
            if (canBeFormed(c1, count(w)))
                len += w.length();
        return len;
    }

    boolean canBeFormed(int[] c1, int[] c2) {
        for (int i = 0; i < c1.length; i++)
            if (c2[i] > c1[i])
                return false;
        return true;
    }

    int[] count(String w) {
        int[] r = new int[26];
        for (int i = 0; i < w.length(); i++)
            r[w.charAt(i) - 'a']++;
        return r;
    }
}
