package problems;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Number of Orders in the Backlog
 */
public class s1801 {
    @SuppressWarnings("ConstantConditions")
    public int getNumberOfBacklogOrders(int[][] orders) {
        PriorityQueue<int[]> sells = new PriorityQueue<>(Comparator.comparingInt(a -> a[0])), buys = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for (int[] o : orders) {
            if (o[2] == 0)
                buys.add(o);
            else sells.add(o);
            while (!buys.isEmpty() && !sells.isEmpty() && buys.peek()[0] >= sells.peek()[0]) {
                int amount = Math.min(buys.peek()[1], sells.peek()[1]);
                buys.peek()[1] -= amount;
                sells.peek()[1] -= amount;
                if (buys.peek()[1] == 0)
                    buys.poll();
                if (sells.peek()[1] == 0)
                    sells.poll();
            }
        }
        int mod = 1_000_000_007, r = 0;
        while (!buys.isEmpty())
            r = (r + buys.poll()[1]) % mod;
        while (!sells.isEmpty())
            r = (r + sells.poll()[1]) % mod;
        return r;
    }
}