package problems;

/**
 * Diet Plan Performance
 */
public class s1176 {
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int sum = 0, points = 0;
        for (int i = 0; i < k - 1; i++)
            sum += calories[i];
        for (int i = k - 1; i < calories.length; i++, sum -= calories[i - k]) {
            sum += calories[i];
            points += sum < lower ? -1 : sum > upper ? 1 : 0;
        }
        return points;
    }
}