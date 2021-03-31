package problems;

/**
 * Armstrong Number
 */
public class s1134 {
    public boolean isArmstrong(int n) {
        for (int power = (int) Math.log10(n) + 1, m = n; m > 0; m /= 10)
            n -= Math.pow(m % 10, power);
        return n == 0;
    }
}