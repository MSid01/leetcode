package problems;

/**
 * Slowest Key
 */
public class s1629 {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char slowest = keysPressed.charAt(0);
        int longestTime = releaseTimes[0];
        for (int i = 1; i < releaseTimes.length; i++) {
            int time = releaseTimes[i] - releaseTimes[i - 1];
            if (time > longestTime) {
                slowest = keysPressed.charAt(i);
                longestTime = time;
            }
            if (time == longestTime && slowest < keysPressed.charAt(i))
                slowest = keysPressed.charAt(i);
        }
        return slowest;
    }
}
