package problems;

/**
 * Missing Number In Arithmetic Progression
 */
public class s1228 {
    public int missingNumber(int[] a) {
        for (int i = 1, d = (a[a.length - 1] - a[0]) / a.length; i < a.length; i++)
            if (a[i - 1] + d != a[i])
                return a[i - 1] + d;
        return a[0];
    }
}
