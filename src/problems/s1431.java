package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Kids With the Greatest Number of Candies
 */
public class s1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean> r = new ArrayList<>(candies.length);
        for (int c : candies)
            r.add(c + extraCandies >= max);
        return r;
    }
}
