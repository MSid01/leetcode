package problems;

/**
 * Minimum Swaps to Make Strings Equal
 */
public class s1247 {
    public int minimumSwap(String s1, String s2) {
        int xy = 0, yx = 0;
        for (int i = 0; i < s1.length(); i++) {
            xy += s1.charAt(i) == 'x' && s2.charAt(i) == 'y' ? 1 : 0;
            yx += s1.charAt(i) == 'y' && s2.charAt(i) == 'x' ? 1 : 0;
        }
        return xy % 2 != yx % 2 ? -1 : xy / 2 + yx / 2 + xy % 2 + yx % 2;
    }
}