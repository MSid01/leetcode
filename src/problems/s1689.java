package problems;

/**
 * Partitioning Into Minimum Number Of Deci-Binary Numbers
 */
public class s1689 {
    public int minPartitions(String n) {
        int max = 0;
        for (char c : n.toCharArray())
            max = Math.max(max, c - '0');
        return max;
    }
}
