package problems;

/**
 * Reformat Date
 */
public class s1507 {
    public String reformatDate(String date) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, parts = date.split(" ");
        String day = parts[0].substring(0, parts[0].length() - 2), month = parts[1], year = parts[2];
        for (int i = 0; i < months.length; i++)
            if (month.equals(months[i]))
                month = String.valueOf(i + 1);
        return String.format("%s-%s-%s", year, month.length() == 1 ? "0" + month : month, day.length() == 1 ? "0" + day : day);
    }
}