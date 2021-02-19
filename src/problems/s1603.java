package problems;

public class s1603 {
    class ParkingSystem {
        final int[] spaces;

        public ParkingSystem(int big, int medium, int small) {
            spaces = new int[]{big, medium, small};
        }

        public boolean addCar(int carType) {
            if (spaces[carType - 1] == 0)
                return false;
            spaces[carType - 1]--;
            return true;
        }
    }
}
