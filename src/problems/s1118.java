package problems;

/**
 * Number of Days in a Month
 */
public class s1118 {
    public int numberOfDays(int y, int m) {
        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, r = days[m - 1];
        return m == 2 && leap(y) ? r + 1 : r;
    }

    boolean leap(int y) {
        return y % 400 == 0 || (y % 4 == 0 && y % 100 != 0);
    }
}
