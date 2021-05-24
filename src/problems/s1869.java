package problems;

/**
 * Longer Contiguous Segments of Ones than Zeros
 */
public class s1869 {
    public boolean checkZeroOnes1(String s) {
        int[] zeroOne = {0, 0};
        for (int i = 0; i < s.length(); )
            for (int j = 0, k = i; j <= 1; j++, k = i) {
                for (; i < s.length() && s.charAt(i) - '0' == j; i++) ;
                zeroOne[j] = Math.max(i - k, zeroOne[j]);
            }
        return zeroOne[1] > zeroOne[0];
    }

    public boolean checkZeroOnes(String s) {
        int[] count = {0, 0}, max = {0, 0};
        for (char c : s.toCharArray()) {
            if (c == '0')
                count = new int[]{count[0] + 1, 0};
            else count = new int[]{0, count[1] + 1};
            max = new int[]{Math.max(max[0], count[0]), Math.max(max[1], count[1])};
        }
        return max[1] > max[0];
    }
}