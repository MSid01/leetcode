package problems;

/**
 * Sign of the Product of an Array
 */
public class s1822 {
    public int arraySign(int[] a) {
        int sig = 1;
        for (int i : a)
            if (i == 0)
                return 0;
            else if (i < 0)
                sig = -sig;
        return sig;
    }
}