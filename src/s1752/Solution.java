package s1752;

public class Solution {
    public boolean check(int[] a) {
        for (int i = 0, k = 0; i < a.length; i++)
            if (a[i] > a[(i + 1) % a.length] && ++k > 1)
                return false;
        return true;
    }
}