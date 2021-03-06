package problems;

/**
 * Number of Students Doing Homework at a Given Time
 */
public class s1450 {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int r = 0;
        for (int i = 0; i < startTime.length; i++)
            if (startTime[i] <= queryTime && queryTime <= endTime[i])
                r++;
        return r;
    }
}
