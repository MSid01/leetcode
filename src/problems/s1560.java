package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Most Visited Sector in a Circular Track
 */
public class s1560 {
    public List<Integer> mostVisited(int n, int[] rounds) {
        int counts[] = new int[n + 1], mostVisited = 0;
        counts[rounds[0]]++;
        for (int i = 1; i < rounds.length; i++)
            for (int j = rounds[i - 1]; j != rounds[i]; ) {
                j = j == n ? 1 : j + 1;
                counts[j]++;
                mostVisited = Math.max(mostVisited, counts[j]);
            }
        List<Integer> r = new ArrayList<>();
        for (int i = 1; i < counts.length; i++)
            if (counts[i] == mostVisited)
                r.add(i);
        return r;
    }

    public List<Integer> mostVisited1(int n, int[] rounds) {
        int start = rounds[0], end = rounds[rounds.length - 1];
        List<Integer> r = new ArrayList<>();
        for (int i = start; i <= end; i++)
            r.add(i);
        if (r.size() > 0) return r;
        for (int i = 1; i <= end; i++)
            r.add(i);
        for (int i = start; i <= n; i++)
            r.add(i);
        return r;
    }
}
