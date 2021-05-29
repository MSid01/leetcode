package problems;

/**
 * Maximum Nesting Depth of Two Valid Parentheses Strings
 */
public class s1111 {
    public int[] maxDepthAfterSplit(String seq) {
        int r[] = new int[seq.length()], d = 0;
        for (int i = 0; i < seq.length(); i++)
            r[i] = seq.charAt(i) == '(' ? ++d % 2 : d-- % 2;
        return r;
    }
}