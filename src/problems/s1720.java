package problems;

/**
 * Decode XORed Array
 */
public class s1720 {
    public int[] decode(int[] encoded, int first) {
        int[] d = new int[encoded.length + 1];
        d[0] = first;
        for (int i = 0; i < encoded.length; i++)
            d[i + 1] = encoded[i] ^ d[i];
        return d;
    }
}
