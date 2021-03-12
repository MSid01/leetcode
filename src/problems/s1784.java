package problems;

/**
 * Check if Binary String Has at Most One Segment of Ones
 */
public class s1784 {
    public boolean checkOnesSegment(String s) {
        for (int i = s.length() - 1; i > 0; i--)
            if (s.charAt(i) == '1' && s.charAt(i - 1) == '0')
                return false;
        return true;
    }
}
