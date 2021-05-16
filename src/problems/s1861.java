package problems;

/**
 * Rotating the Box
 */
public class s1861 {
    public char[][] rotateTheBox(char[][] box) {
        for (char[] row : box) {
            for (int empty = row.length - 1, i = row.length - 1; i >= 0; i--)
                if (row[i] == '#') {
                    row[i] = '.';
                    row[empty--] = '#';
                } else if (row[i] == '*')
                    empty = i - 1;

        }
        char r[][] = new char[box[0].length][box.length];
        for (int i = box.length - 1; i >= 0; i--)
            for (int j = 0; j < box[0].length; j++)
                r[j][box.length - 1 - i] = box[i][j];
        return r;
    }
}