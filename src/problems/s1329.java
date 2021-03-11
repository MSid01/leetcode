package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Sort the Matrix Diagonally
 */
public class s1329 {
    public int[][] diagonalSort(int[][] m) {
        Map<Integer, PriorityQueue<Integer>> t = new HashMap<>();
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++) {
                t.putIfAbsent(i - j, new PriorityQueue<>());
                t.get(i - j).add(m[i][j]);
            }
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                m[i][j] = t.get(i - j).poll();
        return m;
    }
}