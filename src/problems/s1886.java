package problems;

/**
 * Determine Whether Matrix Can Be Obtained By Rotation
 */
public class s1886 {
    public boolean findRotation(int[][] m, int[][] t) {
        boolean r1 = true, r2 = true, r3 = true, r4 = true;
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] != t[i][j])
                    r1 = false;
                if (m[i][j] != t[j][m.length - 1 - i])
                    r2 = false;
                if (m[i][j] != t[m.length - 1 - i][m.length - 1 - j])
                    r3 = false;
                if (m[i][j] != t[m.length - 1 - j][i])
                    r4 = false;
            }
        return r1 || r2 || r3 || r4;
    }
}