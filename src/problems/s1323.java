package problems;

/**
 * Maximum 69 Number
 */
public class s1323 {
    public static void main(String[] args) {
        System.out.println(Math.pow(10, -1));
    }

    public int maximum69Number(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        for (int i = 0; i < digits.length; i++)
            if (digits[i] == '6') {
                digits[i] = '9';
                return Integer.parseInt(new String(digits));
            }
        return n;
    }

    public int maximum69Number1(int n) {
        int firstSix = -1;
        for (int i = 0, m = n; m > 0; i++, m /= 10)
            if (m % 10 == 6)
                firstSix = i;
        return n + 3 * (int) Math.pow(10, firstSix);
    }
}
