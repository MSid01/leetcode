package problems;

import java.util.Arrays;

/**
 * Two City Scheduling
 */
public class s1029 {
    public int twoCitySchedCost(int[][] costs) {
        int cost = 0, savings[] = new int[costs.length];
        for (int i = 0; i < savings.length; i++) {
            cost += costs[i][0];
            savings[i] = costs[i][1] - costs[i][0];
        }
        Arrays.sort(savings);
        for (int i = 0; i < savings.length / 2; i++)
            cost += savings[i];
        return cost;
    }
}