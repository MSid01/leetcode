package problems;

/**
 * Shortest Way to Form String
 */
public class s1055 {
    public int shortestWay(String source, String target) {
        int r = 0, i = 0, j = 0;
        for (int prevJ = 0; j < target.length(); ) {
            if (source.charAt(i++) == target.charAt(j))
                j++;
            if (i == source.length()) {
                if (prevJ == j) return -1;
                prevJ = j;
                i = 0;
                r++;
            }
        }
        return r + (i > 0 ? 1 : 0);
    }
}