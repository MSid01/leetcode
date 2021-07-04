package problems;

/**
 * Find the Winner of an Array Game
 */
public class s1535 {
    public int getWinner(int[] a, int k) {
        int winner = Math.max(a[0], a[1]);
        for (int i = 2, wins = 1; wins < k && i < a.length; i++)
            if (winner < a[i]) {
                winner = a[i];
                wins = 1;
            } else wins++;
        return winner;
    }
}