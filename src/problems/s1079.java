package problems;

/**
 * Letter Tile Possibilities
 */
public class s1079 {
    public int numTilePossibilities(String tiles) {
        int[] count = new int[26];
        for (char c : tiles.toCharArray())
            count[c - 'A']++;
        return p(count);
    }

    int p(int[] a) {
        int r = 0;
        for (int i = 0; i < 26; i++)
            if (a[i] > 0) {
                a[i]--;
                r += 1 + p(a);
                a[i]++;
            }
        return r;
    }
}