package problems;

import java.util.Arrays;

public class s1894 {
    public int chalkReplacer(int[] chalk, int k) {
        int i = 0, r = (int) (k % Arrays.stream(chalk).asLongStream().sum());
        for (; i < chalk.length && r - chalk[i] >= 0; r -= chalk[i++]) ;
        return i;
    }
}