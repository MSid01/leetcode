package problems;

import java.util.TreeSet;

/**
 * Seat Reservation Manager
 */
public class s1845 {
    class SeatManager {
        final TreeSet<Integer> free = new TreeSet<>();

        public SeatManager(int n) {
            for (int i = 1; i <= n; i++)
                free.add(i);
        }

        public int reserve() {
            return free.pollFirst();
        }

        public void unreserve(int seatNumber) {
            free.add(seatNumber);
        }
    }
}