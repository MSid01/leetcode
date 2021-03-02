package problems;

/**
 * Day of the Week
 */
public class s1185 {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] dayOfWeeks = {"Thursday","Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};
        int days = daysSince1971(day, month, year);
        return dayOfWeeks[days % 7];
    }

    int daysSince1971(int day, int month, int year) {
        for (int y = 1971; y < year; y++)
            day += isLeap(y) ? 366 : 365;
        for (int m = 0; m < month - 1; m++)
            day += days[m];
        return month > 2 && isLeap(year) ? day + 1 : day;
    }

    int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    boolean isLeap(int y) { return y % 400 == 0 || (y % 4 == 0 && y % 100 != 0);}
}
