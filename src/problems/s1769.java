package problems;

import java.util.Arrays;

/**
 * Minimum Number of Operations to Move All Balls to Each Box
 */
public class s1769 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new s1769().minOperations("001011")));
    }

    public int[] minOperations(String boxes) {
        int[] r = new int[boxes.length()];
        for (int i = 0, ops = 0, balls = 0; i < boxes.length(); i++) {
            r[i] = ops;
            balls += Character.getNumericValue(boxes.charAt(i));
            ops += balls;
        }
        for (int i = boxes.length() - 1, ops = 0, balls = 0; i >= 0; i--) {
            r[i] += ops;
            balls += Character.getNumericValue(boxes.charAt(i));
            ops += balls;
        }
        return r;
    }
}
