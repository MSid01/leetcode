package problems;

/**
 * Distance Between Bus Stops
 */
public class s1184 {
    public int distanceBetweenBusStops(int[] distance, int s, int d) {
        if (s > d) return distanceBetweenBusStops(distance, d, s);
        int total = 0, oneWay = 0;
        for (int i = 0; i < distance.length; i++) {
            total += distance[i];
            if (i >= s && i < d)
                oneWay += distance[i];
        }
        return Math.min(oneWay, total - oneWay);
    }
}
