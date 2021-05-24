package problems;

import java.util.*;

/**
 * People Whose List of Favorite Companies Is Not a Subset of Another List
 */
public class s1452 {
    public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
        Map<String, Set<Integer>> m = new HashMap<>();
        for (int i = 0; i < favoriteCompanies.size(); i++)
            for (String company : favoriteCompanies.get(i)) {
                m.putIfAbsent(company, new HashSet<>());
                m.get(company).add(i);
            }
        List<Integer> r = new LinkedList<>();
        for (int i = 0; i < favoriteCompanies.size(); i++) {
            boolean[] notSubset = new boolean[favoriteCompanies.size()];
            for (String company : favoriteCompanies.get(i)) {
                Set<Integer> indices = m.get(company);
                for (int j = 0; j < notSubset.length; j++)
                    if (!indices.contains(j))
                        notSubset[j] = true;
            }
            int count = 0;
            for (boolean b : notSubset)
                if (!b)
                    count++;
            if (count == 1)
                r.add(i);
        }
        return r;
    }
}
