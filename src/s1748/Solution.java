package s1748;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class Solution {
    public int sumOfUnique(int[] a) {
        Set<Integer> uniq = new HashSet<>(), dups = new HashSet<>();
        int sum = 0;
        for (Integer i : a)
            if (uniq.add(i))
                sum += i;
            else if (dups.add(i))
                sum -= i;
        return sum;
    }

    public int sumOfUnique1(int[] a) {
        int[] c = new int[101];
        IntStream.of(a).forEach(e -> c[e]++);
        return IntStream.range(1, 101).filter(e -> c[e] == 1).sum();
    }
}
