package problems;

/**
 * Available Captures for Rook
 */
public class s999 {
    public int numRookCaptures(char[][] b) {
        for (int i = 0; i < b.length; i++)
            for (int j = 0; j < b.length; j++)
                if (b[i][j] == 'R')
                    return cap(b, i, j, -1, 0) + cap(b, i, j, 1, 0) + cap(b, i, j, 0, -1) + cap(b, i, j, 0, 1);
        return 0;
    }

    public int cap(char[][] b, int x, int y, int dx, int dy) {
        while (0 <= x && x < b.length && 0 <= y && y < b.length && b[x][y] != 'B') {
            if (b[x][y] == 'p') return 1;
            x += dx;
            y += dy;
        }
        return 0;
    }
}
