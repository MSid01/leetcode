package problems;

/**
 * Find Winner on a Tic Tac Toe Game
 */
public class s1275 {
    public String tictactoe(int[][] moves) {
        int g[][] = new int[3][3], player = -1;
        for (int[] m : moves) {
            g[m[0]][m[1]] = player;
            if (win(g, player))
                return player == -1 ? "A" : "B";
            player = -player;
        }
        return moves.length == 9 ? "Draw" : "Pending";
    }

    boolean win(int[][] g, int p) {
        for (int i = 0; i < g.length; i++)
            if (g[i][0] == p && g[i][1] == p && g[i][2] == p)
                return true;
            else if (g[0][i] == p && g[1][i] == p && g[2][i] == p)
                return true;
        if (g[0][0] == p && g[1][1] == p && g[2][2] == p)
            return true;
        return g[0][2] == p && g[1][1] == p && g[2][0] == p;
    }
}
