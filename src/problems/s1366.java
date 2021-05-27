package problems;

import java.util.stream.Collectors;

/**
 * Rank Teams by Votes
 */
public class s1366 {
    public String rankTeams(String[] votes) {
        int[][] count = new int[26][26];
        for (String v : votes)
            for (int i = 0; i < v.length(); i++)
                count[v.charAt(i) - 'A'][i]++;
        return new String(votes[0].toCharArray()).chars().mapToObj(c -> (char) c).sorted((c1, c2) -> {
            for (int i = 0; i < 26; i++)
                if (count[c1 - 'A'][i] != count[c2 - 'A'][i])
                    return count[c2 - 'A'][i] - count[c1 - 'A'][i];
            return c1 - c2;
        }).map(Object::toString).collect(Collectors.joining());
    }
}