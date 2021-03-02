package problems;

/**
 * Check If It Is a Straight Line
 */
public class s1232 {
    public boolean checkStraightLine(int[][] cs) {
        int dx = cs[0][0] - cs[1][0], dy = cs[0][1] - cs[1][1];
        for (int i = 2; i < cs.length; i++)
            if (dx * (cs[i][1] - cs[0][1]) != dy * (cs[i][0] - cs[0][0]))
                return false;
        return true;
    }
}
