package problems;

/**
 * Special Positions in a Binary Matrix
 */
public class s1582 {
    public int numSpecial(int[][] mat) {
        int rows[] = new int[mat.length], cols[] = new int[mat[0].length], specialCount = 0;
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[0].length; j++)
                if (mat[i][j] == 1) {
                    rows[i]++;
                    cols[j]++;
                }
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[0].length; j++)
                if (rows[i] == 1 && cols[j] == 1 && mat[i][j] == 1)
                    specialCount++;
        return specialCount;
    }
}
