package problems;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Get Watched Videos by Your Friends
 */
public class s1311 {
    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> seen = new HashSet<>();
        q.add(id);
        seen.add(id);
        while (level-- > 0)
            for (int size = q.size(); size > 0; size--)
                Arrays.stream(friends[q.poll()]).filter(seen::add).forEach(q::add);
        Map<String, Integer> m = new HashMap<>();
        q.forEach(f -> watchedVideos.get(f).forEach(v -> m.put(v, m.getOrDefault(v, 0) + 1)));
        return m.keySet().stream().sorted((v1, v2) -> m.get(v1) - m.get(v2) != 0 ? m.get(v1) - m.get(v2) : v1.compareTo(v2)).collect(Collectors.toList());
    }
}