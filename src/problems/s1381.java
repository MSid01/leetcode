package problems;

import java.util.Stack;

/**
 * Design a Stack With Increment Operation
 */
public class s1381 {
    class CustomStack {
        final Stack<Integer> s = new Stack<>();
        final int[] inc;

        public CustomStack(int maxSize) {
            inc = new int[maxSize];
        }

        public void push(int x) {
            if (s.size() < inc.length)
                s.push(x);
        }

        public int pop() {
            int i = s.size() - 1;
            if (i == -1)
                return -1;
            int r = s.pop() + inc[i];
            if (i > 0)
                inc[i - 1] += inc[i];
            inc[i] = 0;
            return r;
        }

        public void increment(int k, int val) {
            int i = Math.min(k, s.size()) - 1;
            if (i >= 0)
                inc[i] += val;
        }
    }
}