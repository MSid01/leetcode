package problems;

/**
 * Distribute Candies to People
 */
public class s1103 {
    public int[] distributeCandies(int candies, int n) {
        int[] people = new int[n];
        for (int i = 0; candies > 0; candies -= i)
            people[i % n] += Math.min(candies, ++i);
        return people;
    }
}