package problems;

/**
 * Maximal Network Rank
 */
public class s1615 {
    public int maximalNetworkRank(int n, int[][] roads) {
        int[] counts = new int[n], connected[] = new int[n][n];
        for (int[] r : roads) {
            counts[r[0]]++;
            counts[r[1]]++;
            connected[r[0]][r[1]] = 1;
            connected[r[1]][r[0]] = 1;
        }
        int max = 0;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                max = Math.max(max, counts[i] + counts[j] - connected[i][j]);
        return max;
    }
}