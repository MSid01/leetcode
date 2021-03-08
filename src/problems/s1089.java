package problems;

import java.util.Arrays;

/**
 * Duplicate Zeros
 */
public class s1089 {
    public static void main(String[] args) {
        int[] a = {1,0,2,3,0,4,5,0};
        new s1089().duplicateZeros(a);
        System.out.println(Arrays.toString(a));
    }

    public void duplicateZeros(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++)
            if (a[i] == 0)
                count++;
            else {
                if (count > 0) {
                    shift(a, i - count, count);
                    i += count;
                }
                count = 0;
            }
    }

    void shift(int[] a, int start, int places) {
        for (int i = a.length - 1 - places; i >= start; i--)
            a[i + places] = a[i];
    }
}
