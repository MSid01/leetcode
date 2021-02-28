package problems;

import java.util.Arrays;

/**
 * Find Numbers with Even Number of Digits
 */
public class s1295 {
    public int findNumbers(int[] nums) {
        return (int) Arrays.stream(nums).filter(n -> (int) Math.log10(n) % 2 == 1).count();
    }
}
