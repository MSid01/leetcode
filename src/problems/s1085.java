package problems;

/**
 * Sum of Digits in the Minimum Number
 */
public class s1085 {
    public int sumOfDigits(int[] a) {
        int min = Integer.MAX_VALUE, sum = 0;
        for (int i : a)
            min = Math.min(min, i);
        while (min > 0) {
            sum += min % 10;
            min /= 10;
        }
        return 1 - sum % 2;
    }
}