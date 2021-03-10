package problems;

/**
 * Check If a Word Occurs As a Prefix of Any Word in a Sentence
 */
public class s1455 {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++)
            if (words[i].startsWith(searchWord))
                return i;
        return -1;
    }

    public int isPrefixOfWord1(String sentence, String searchWord) {
        for (int i = 0, t = 1, j = 0; i < sentence.length(); t++, j = 0, i++) {
            for (; j < searchWord.length() && i < sentence.length() && sentence.charAt(i) != ' '; j++, i++)
                if (searchWord.charAt(j) != sentence.charAt(i))
                    break;
            if (j == searchWord.length())
                return t;
            while (i < sentence.length() && sentence.charAt(i) != ' ')
                i++;
        }
        return -1;
    }
}
