package problems;

/**
 * Number of Days Between Two Dates
 */
public class s1360 {
    public int daysBetweenDates(String d1, String d2) {
        return Math.abs(daysSince1971(d1) - daysSince1971(d2));
    }

    int daysSince1971(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]), month = Integer.parseInt(parts[1]), d = Integer.parseInt(parts[2]);
        for (int y = 1971; y < year; y++)
            d += isLeap(y) ? 366 : 365;
        for (int m = 0; m < month - 1; m++)
            d += days[m];
        return month > 2 && isLeap(year) ? d + 1 : d;
    }

    int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    boolean isLeap(int y) { return y % 400 == 0 || (y % 4 == 0 && y % 100 != 0);}
}
