package problems;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Remove Sub-Folders from the Filesystem
 */
public class s1233 {
    public List<String> removeSubfolders(String[] folders) {
        LinkedList<String> r = new LinkedList<>();
        Arrays.sort(folders);
        r.add(folders[0]);
        for (int i = 1; i < folders.length; i++)
            if (!folders[i].startsWith(r.peekLast() + "/"))
                r.add(folders[i]);
        return r;
    }
}