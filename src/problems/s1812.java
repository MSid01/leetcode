package problems;

/**
 * Determine Color of a Chessboard Square
 */
public class s1812 {
    public boolean squareIsWhite(String cs) {
        return (cs.charAt(0) + cs.charAt(1)) % 2 == 0;
    }
}
