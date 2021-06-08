package problems;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Numbers With Same Consecutive Differences
 */
public class s967 {
    public int[] numsSameConsecDiff(int n, int k) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        while (n-- > 1)
            for (int size = q.size(); size > 0; size--) {
                int a = q.poll(), d = a % 10, d1 = d + k, d2 = d - k;
                if (d1 <= 9)
                    q.offer(a * 10 + d1);
                if (d2 >= 0 && d2 != d1)
                    q.offer(a * 10 + d2);
            }
        return q.stream().mapToInt(i -> i).toArray();
    }
}