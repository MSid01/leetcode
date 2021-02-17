package problems;

/**
 * Maximum Number of Balls in a Box
 */
public class s1742 {
    public int countBalls(int lo, int hi) {
        int boxes[] = new int[46], max = 0;
        for (int i = lo; i <= hi; i++) {
            int sum = 0, n = i;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            max = Math.max(max, ++boxes[sum]);
        }
        return max;
    }
}
