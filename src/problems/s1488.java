package problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * Avoid Flood in The City
 */
public class s1488 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new s1488().avoidFlood(new int[]{0, 1, 1})));
    }

    public int[] avoidFlood(int[] rains) {
        LinkedList<Integer> dryDays = new LinkedList<>();
        Set<Integer> fullLakes = new HashSet<>();
        for (int i = 0; i < rains.length; i++)
            if (rains[i] > 0) {
                if (fullLakes.remove(rains[i])) {
                    if (dryDays.isEmpty())
                        return new int[]{};
                    rains[dryDays.pollLast()] = rains[i];
                } else fullLakes.add(rains[i]);
                rains[i] = -1;
            } else dryDays.add(i);
        while (!dryDays.isEmpty())
            rains[dryDays.pollLast()] = 1;
        return rains;
    }
}
