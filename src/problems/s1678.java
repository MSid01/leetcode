package problems;

/**
 * Goal Parser Interpretation
 */
public class s1678 {
    public String interpret(String command) {
        return command.replaceAll("\\(\\)", "o").replaceAll("\\(al\\)", "al");
    }

    public String interpret1(String command) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            char c = command.charAt(i);
            if (c == 'G')
                b.append('G');
            else if (command.charAt(i + 1) == ')') {
                b.append('o');
                i++;
            } else {
                b.append("al");
                i += 3;
            }
        }
        return b.toString();
    }
}
