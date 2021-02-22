package problems;

/**
 * Number Of Rectangles That Can Form The Largest Square
 */
public class s1725 {
    public int countGoodRectangles(int[][] rect) {
        int max = 0, count = 0;
        for (int[] r : rect) {
            int side = Math.min(r[0], r[1]);
            if (side == max)
                count++;
            else if (side > max) {
                count = 1;
                max = side;
            }
        }
        return count;
    }
}
