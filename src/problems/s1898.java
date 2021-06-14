package problems;

/**
 * Maximum Number of Removable Characters
 */
public class s1898 {
    public int maximumRemovals(String s, String p, int[] removable) {
        int c1[] = new int[26], c2[] = new int[26], i = 0;
        s.chars().forEach(c -> c1[c - 'a']++);
        p.chars().forEach(c -> c2[c - 'a']++);
        for (; i < removable.length; i++)
            if (--c1[s.charAt(removable[i]) - 'a'] < c2[s.charAt(removable[i]) - 'a'])
                break;
        return i;
    }
}
