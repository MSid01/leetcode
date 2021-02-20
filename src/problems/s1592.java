package problems;

/**
 * Rearrange Spaces Between Words
 */
public class s1592 {
    public String reorderSpaces(String text) {
        String[] words = text.trim().split("\\s+");
        int spaces = (int) text.chars().filter(c -> c == ' ').count();
        int gap = words.length > 1 ? spaces / (words.length - 1) : 0;
        return String.join(" ".repeat(gap), words) + " ".repeat(spaces - gap * (words.length - 1));
    }
}