package problems;

import java.util.LinkedList;

/**
 * Subrectangle Queries
 */
public class s1476 {
    class SubrectangleQueries {
        int[][] r;
        LinkedList<int[]> updates = new LinkedList<>();

        public SubrectangleQueries(int[][] r) {
            this.r = r;
        }

        public void updateSubrectangle(int row1, int col1, int row2, int col2, int val) {
            updates.addFirst(new int[]{row1, row2, col1, col2, val});
        }

        public int getValue(int row, int col) {
            for (int[] u : updates)
                if (u[0] <= row && row <= u[1] && u[2] <= col && col <= u[3])
                    return u[4];
            return r[row][col];
        }
    }
}
