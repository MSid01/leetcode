package problems;

/**
 * Minimum Cost to Move Chips to The Same Position
 */
public class s1217 {
    public int minCostToMoveChips(int[] position) {
        int odd = 0, even = 0;
        for (int p : position)
            if (p % 2 == 0)
                even++;
            else odd++;
        return Math.min(even, odd);
    }
}
