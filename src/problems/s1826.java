package problems;

/**
 * Faulty Sensor
 */
public class s1826 {
    public int badSensor(int[] s1, int[] s2) {
        for (int i = 0; i + 1 < s1.length; i++)
            if (s1[i] != s2[i]) {
                for (; i + 1 < s1.length && s1[i] == s2[i + 1]; i++) ;
                return i + 1 == s1.length ? 1 : 2;
            }
        return -1;
    }
}