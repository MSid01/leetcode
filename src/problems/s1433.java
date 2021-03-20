package problems;

/**
 * Check If a String Can Break Another String
 */
public class s1433 {
    public boolean checkIfCanBreak(String s1, String s2) {
        int[] c1 = new int[26], c2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            c1[s1.charAt(i) - 'a']++;
            c2[s2.charAt(i) - 'a']++;
        }
        return canBreak(c1, c2) || canBreak(c2, c1);

    }

    boolean canBreak(int[] d1, int[] d2) {
        int s = 0;
        for (int i = 0; i < 26; i++) {
            s += d1[i] - d2[i];
            if (s < 0)
                return false;
        }
        return true;
    }
}