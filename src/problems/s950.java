package problems;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Reveal Cards In Increasing Order
 */
public class s950 {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < deck.length; i++)
            q.add(i);
        int[] r = new int[deck.length];
        for (int c : deck) {
            r[q.poll()] = c;
            q.add(q.poll());
        }
        return r;
    }
}
