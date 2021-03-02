package problems;

/**
 * Day of the Year
 */
public class s1154 {
    public int dayOfYear(String date) {
        String[] p = date.split("-");
        int year = Integer.parseInt(p[0]), month = Integer.parseInt(p[1]), d = Integer.parseInt(p[2]);
        for (int m = 1; m < month; m++)
            d += months[m - 1];
        return d + (isLeap(year) && month > 2 ? 1 : 0);
    }

    int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    boolean isLeap(int y) {
        return y % 400 == 0 || (y % 4 == 0 && y % 100 != 0);
    }
}
