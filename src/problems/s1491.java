package problems;

/**
 * Average Salary Excluding the Minimum and Maximum Salary
 */
public class s1491 {
    public double average(int[] salary) {
        int sum = 0, min = Integer.MAX_VALUE, max = 0;
        for (int s : salary) {
            min = Math.min(min, s);
            max = Math.max(max, s);
            sum += s;
        }
        return (sum * 1.0 - min - max) / (salary.length - 2);
    }
}
