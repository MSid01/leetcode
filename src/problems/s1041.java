package problems;

/**
 * Robot Bounded In Circle
 */
public class s1041 {
    public boolean isRobotBounded(String s) {
        int xy[] = {0, 0}, d = 0, dirs[][] = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        for (int i = 0; i < s.length(); i++, d %= 4)
            if (s.charAt(i) == 'G')
                xy = new int[]{xy[0] + dirs[d][0], xy[1] + dirs[d][1]};
            else d += s.charAt(i) == 'R' ? 1 : 3;
        return (xy[0] == 0 && xy[1] == 0) || d > 0;
    }
}