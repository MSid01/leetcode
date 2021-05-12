package problems;

/**
 * Sentence Similarity III
 */
public class s1813 {
    public boolean areSentencesSimilar(String s1, String s2) {
        String[] w1 = s1.split(" "), w2 = s2.split(" ");
        if (w1.length > w2.length)
            return areSentencesSimilar(s2, s1);
        int i = 0;
        for (; i < w1.length && w1[i].equals(w2[i]); i++) ;
        for (; i < w1.length && w1[i].equals(w2[w2.length - w1.length + i]); i++) ;
        return i == w1.length;
    }
}