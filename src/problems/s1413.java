package problems;

/**
 * Minimum Value to Get Positive Step by Step Sum
 */
public class s1413 {
    public int minStartValue(int[] nums) {
        int sum = 0, min = 0;
        for (int a : nums) {
            sum += a;
            min = Math.min(min, sum);
        }
        return 1 - min;
    }
}
