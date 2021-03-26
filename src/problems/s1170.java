package problems;

/**
 * Compare Strings by Frequency of the Smallest Character
 */
public class s1170 {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] r = new int[queries.length], cf = new int[11];
        for (String w : words)
            cf[f(w)]++;
        for (int i = 1; i < cf.length; i++)
            cf[i] += cf[i - 1];
        for (int i = 0; i < queries.length; i++) {
            int count = f(queries[i]);
            r[i] = cf[cf.length - 1] - cf[count];
        }
        return r;
    }

    int f(String w) {
        int[] fr = new int[26];
        for (int i = 0; i < w.length(); i++)
            fr[w.charAt(i) - 'a']++;
        for (int i = 0; i < 26; i++)
            if (fr[i] > 0)
                return fr[i];
        return 0;
    }
}