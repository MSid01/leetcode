package problems;

/**
 * Filling Bookcase Shelves
 */
public class s1105 {
    public int minHeightShelves(int[][] books, int W) {
        int[] dp = new int[books.length + 1]; //min height to fit i books
        for (int i = 0; i < books.length; i++) {
            dp[i + 1] = Integer.MAX_VALUE;
            for (int j = i, h = 0, w = 0; j >= 0 && w + books[j][0] <= W; j--) {
                w += books[j][0];
                h = Math.max(h, books[j][1]);
                dp[i + 1] = Math.min(dp[i + 1], dp[j] + h);
            }
        }
        return dp[books.length];
    }
}