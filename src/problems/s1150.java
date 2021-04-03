package problems;

/**
 * Check If a Number Is Majority Element in a Sorted Array
 */
public class s1150 {
    public boolean isMajorityElement(int[] a, int target) {
        int start = start(a, target), end = a.length / 2 + start;
        return end < a.length && a[end] == target;
    }

    int start(int[] a, int t) {
        int lo = 0, hi = a.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (t > a[mid])
                lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}