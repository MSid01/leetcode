package problems;

/**
 * Iterator for Combination
 */
public class s1286 {
    class CombinationIterator {
        int a[];
        char[] s, next;

        public CombinationIterator(String s, int combinationLength) {
            this.s = s.toCharArray();
            next = new char[combinationLength];
            a = new int[combinationLength];
            for (int i = 0; i < combinationLength; i++) {
                a[i] = i;
                next[i] = this.s[i];
            }
        }

        public String next() {
            String curr = new String(next);
            int idx = incrementIdx();
            if (idx == -1)
                next = null;
            else {
                a[idx]++;
                for (int i = idx + 1; i < a.length; i++)
                    a[i] = a[i - 1] + 1;
                for (int i = 0; i < a.length; i++)
                    next[i] = s[a[i]];
            }
            return curr;
        }

        public boolean hasNext() { return next != null;}

        int incrementIdx() {
            for (int i = a.length - 1, prev = s.length; i >= 0; i--)
                if (a[i] + 1 < prev)
                    return i;
                else prev = a[i];
            return -1;
        }
    }
}