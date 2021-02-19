package problems;

/**
 * Matrix Diagonal Sum
 */
public class s1572 {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++)
            sum += mat[i][i] + mat[i][mat.length - i - 1];
        return mat.length % 2 == 0 ? sum : sum - mat[mat.length / 2][mat.length /    2];
    }
}
