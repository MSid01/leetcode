package problems;

/**
 * Count Sorted Vowel Strings
 */
public class s1641 {
    public int countVowelStrings(int n) {
        if (n == 0) return 0;
        int count = 0;
        for (int i = 0; i < n; i++)
            count += countVowelStrings(n - 1);
        return count;
    }
}