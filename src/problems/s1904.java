package problems;

/**
 * The Number of Full Rounds You Have Played
 */
public class s1904 {
    public int numberOfRounds(String st, String ft) {
        int s = mins(st), f = mins(ft);
        f += s > f ? 24 * 60 : 0;
        return (int) (Math.floor(f / 15.0) - Math.ceil(s / 15.0));
    }

    int mins(String s) {return Integer.parseInt(s.substring(0, 2)) * 60 + Integer.parseInt(s.substring(3, 5));}
}