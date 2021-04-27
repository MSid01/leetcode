package problems;

import java.util.List;

/**
 * Leftmost Column with at Least a One
 */
public class s1428 {
    public int leftMostColumnWithOne(BinaryMatrix bm) {
        int R = bm.dimensions().get(0), C = bm.dimensions().get(1), col = C - 1, row = 0, r = -1;
        while (col >= 0 && row < R)
            if (bm.get(row, col) == 1) {
                r = col;
                col--;
            } else row++;
        return r;
    }

    interface BinaryMatrix {
        int get(int row, int col);

        List<Integer> dimensions();
    }
}