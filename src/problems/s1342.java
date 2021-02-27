package problems;

/**
 * Number of Steps to Reduce a Number to Zero
 */
public class s1342 {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(123));
    }

    public int numberOfSteps(int num) {
        return num > 1 ? 1 + num % 2 + numberOfSteps(num >> 1) : num;
    }
}
