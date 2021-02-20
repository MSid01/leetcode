package problems;

/**
 * Crawler Log Folder
 */
public class s1598 {
    public int minOperations(String[] logs) {
        int depth = 0;
        for (String log : logs)
            if (log.charAt(0) != '.')
                depth++;
            else if (log.charAt(1) == '.')
                depth = Math.max(depth - 1, 0);
        return depth;
    }
}
