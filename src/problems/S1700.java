package problems;

import java.util.Arrays;

/**
 * Number of Students Unable to Eat Lunch
 */
public class S1700 {
    public int countStudents(int[] students, int[] sandwiches) {
        int count[] = new int[2], i;
        Arrays.stream(students).forEach(s -> count[s]++);
        for (i = 0; i < sandwiches.length && count[sandwiches[i]] > 0; i++)
            count[sandwiches[i]]--;
        return sandwiches.length - i;
    }
}
