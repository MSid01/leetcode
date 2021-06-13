package problems;

/**
 * Airplane Seat Assignment Probability
 */
public class s1227 {
    public double nthPersonGetsNthSeat(int n) {
        return n == 1 ? 1 : 0.5;
    }
}