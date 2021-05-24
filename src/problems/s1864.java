package problems;

/**
 * Minimum Number of Swaps to Make the Binary String Alternating
 */
public class s1864 {
    public int minSwaps(String s) {
        int ones = (int) s.chars().filter(c -> c == '1').count(), zero = s.length() - ones, zeroSwaps = 0, oneSwaps = 0;
        for (int i = 0; i < s.length(); i += 2)
            if (s.charAt(i) != '1')
                oneSwaps++;
            else zeroSwaps++;
        if (Math.abs(ones - zero) > 1)
            return -1;
        else if (ones == zero)
            return Math.min(oneSwaps, zeroSwaps);
        return ones > zero ? oneSwaps : zeroSwaps;
    }
}