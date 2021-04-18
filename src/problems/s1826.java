package problems;

/**
 * Faulty Sensor
 */
public class s1826 {
    public int badSensor(int[] s1, int[] s2) {
        int idx = 0, i;
        for (; idx < s1.length && s1[idx] == s2[idx]; idx++) ;
        if (idx == s1.length - 1) return -1;
        for (i = idx + 1; i < s1.length && s1[i - 1] == s2[i]; i++) ;
        if (i == s1.length && s2[idx] != s1[i - 1])
            return 1;
        for (i = idx + 1; i < s1.length && s2[i - 1] == s1[i]; i++) ;
        if (i == s1.length && s1[idx] != s2[i - 1])
            return 2;
        return -1;
    }
}