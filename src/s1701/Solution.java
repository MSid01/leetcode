package s1701;

public class Solution {
    public double averageWaitingTime(int[][] customers) {
        double t = 0, total = 0;
        for (int[] c : customers) {
            if (t <= c[0]) {
                t = c[0] + c[1];
                total += c[1];
            } else {
                total += t - c[0] + c[1];
                t = t + c[1];
            }
        }
        return total / customers.length;
    }
}
