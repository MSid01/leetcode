package problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Minimum Cost For Tickets
 */
public class s983 {
    public int mincostTickets(int[] days, int[] costs) {
        int dp[] = new int[days.length], passes[][] = new int[][]{{1, costs[0]}, {7, costs[1]}, {30, costs[2]}};
        Arrays.fill(dp, Integer.MAX_VALUE);
        for (int i = 0; i < days.length; i++)
            for (int[] p : passes) {
                int day = days[i] - p[0] + 1, prevCost = 0;
                for (int j = i - 1; j >= 0; j--)
                    if (day > days[j]) {
                        prevCost = dp[j];
                        break;
                    }
                dp[i] = Math.min(dp[i], prevCost + p[1]);
            }
        return dp[dp.length - 1];
    }

    public int mincostTickets1(int[] days, int[] costs) {
        int lastDay = days[days.length - 1], dp[] = new int[lastDay + 1];
        Set<Integer> travelDays = IntStream.of(days).boxed().collect(Collectors.toCollection(HashSet::new));
        for (int day = 1; day <= lastDay; day++)
            if (travelDays.contains(day)) {
                dp[day] = costs[0] + dp[day - 1];
                dp[day] = Math.min(dp[day], costs[1] + dp[Math.max(0, day - 7)]);
                dp[day] = Math.min(dp[day], costs[2] + dp[Math.max(0, day - 30)]);
            } else dp[day] = dp[day - 1];
        return dp[lastDay];
    }
}