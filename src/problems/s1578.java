package problems;

/**
 * Minimum Deletion Cost to Avoid Repeating Letters
 */
public class s1578 {
    public int minCost(String s, int[] cost) {
        int r = 0;
        for (int i = 0; i < s.length(); i++) {
            int max = cost[i], sum = cost[i];
            while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                sum += cost[i + 1];
                max = Math.max(max, cost[i++ + 1]);
            }
            r += sum - max;
        }
        return r;
    }
}