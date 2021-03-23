package problems;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Video Stitching
 */
public class s1024 {
    public int videoStitching(int[][] clips, int T) {
        int r = 0;
        Arrays.sort(clips, Comparator.comparing(a -> a[0]));
        for (int i = 0, start = 0, end = 0; start < T; start = end, r++) {
            for (; i < clips.length && clips[i][0] <= start; i++)
                end = Math.max(end, clips[i][1]);
            if (start == end) return -1;
        }
        return r;
    }
}