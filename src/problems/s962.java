package problems;

import java.util.Stack;

public class s962 {
    public static void main(String[] args) {
        System.out.println(new s962().maxWidthRamp(new int[]{9, 8, 1, 0, 1, 9, 4, 0, 4, 1}));
    }

    public int maxWidthRamp(int[] a) {
        Stack<Integer> s = new Stack<>();
        int r = 0;
        for (int i = 0; i < a.length; i++)
            if (s.isEmpty() || a[s.peek()] >= a[i])
                s.push(i);
        for (int i = a.length - 1; i > r; i--)
            while (!s.isEmpty() && a[s.peek()] <= a[i])
                r = Math.max(r, i - s.pop());
        return r;
    }
}