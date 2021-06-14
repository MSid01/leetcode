package problems;

import java.util.*;

/**
 * Throne Inheritance
 */
public class s1600 {
    class ThroneInheritance {
        final String king;
        final Map<String, List<String>> names = new HashMap<>();
        final Set<String> dead = new HashSet<>();

        public ThroneInheritance(String kingName) {
            king = kingName;
            names.put(king, new ArrayList<>());
        }

        public void birth(String parentName, String childName) {
            names.put(childName, new ArrayList<>());
            names.get(parentName).add(childName);
        }

        public void death(String name) { dead.add(name);}

        public List<String> getInheritanceOrder() {
            List<String> r = new ArrayList<>(names.size() - dead.size());
            dfs(king, r);
            return r;
        }

        void dfs(String name, List<String> r) {
            if (!dead.contains(name))
                r.add(name);
            for (String childName : names.get(name))
                dfs(childName, r);
        }
    }
}