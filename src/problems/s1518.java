package problems;

/**
 * Water Bottles
 */
public class s1518 {
    public int numWaterBottles(int full, int numExchange) {
        int drink = 0, empty = 0;
        while (full > 0) {
            drink += full;
            empty += full;
            full = empty / numExchange;
            empty = empty % numExchange;
        }
        return drink;
    }
}
