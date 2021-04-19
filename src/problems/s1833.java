package problems;

import java.util.Arrays;

/**
 * Maximum Ice Cream Bars
 */
public class s1833 {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        for (int i = 0; i < costs.length; i++)
            if ((coins -= costs[i]) < 0)
                return i;
        return costs.length;
    }
}