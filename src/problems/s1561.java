package problems;

import java.util.Arrays;

/**
 * Maximum Number of Coins You Can Get
 */
public class s1561 {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int sum = 0;
        for (int i = piles.length - 2, j = 0; j < i; j++, i -= 2)
            sum += piles[i];
        return sum;
    }
}
