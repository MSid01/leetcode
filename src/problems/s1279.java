package problems;

/**
 * Traffic Light Controlled Intersection
 */
public class s1279 {
    class TrafficLight {
        Integer currRoad = 1;

        public void carArrived(int carId, int roadId, int direction, Runnable turnGreen, Runnable crossCar) {
            synchronized (currRoad) {
                if (currRoad != roadId) {
                    turnGreen.run();
                    currRoad = roadId;
                }
                crossCar.run();
            }
        }
    }
}
