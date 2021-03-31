package problems;

/**
 * Broken Calculator
 */
public class s991 {
    public int brokenCalc(int x, int y) {
        if (x >= y)
            return x - y;
        return 1 + (y % 2 == 0 ? brokenCalc(x, y / 2) : brokenCalc(x, y + 1));
    }
}