package problems;

/**
 * Count Odd Numbers in an Interval Range
 */
public class s1523 {
    public int countOdds(int low, int high) {
        if (low % 2 != high % 2)
            return (high - low) / 2 + 1;
        if (low % 2 == 1)
            return (high - low) / 2 + 1;
        return (high - low) / 2;
    }
}
