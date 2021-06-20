package problems;

public class s1404 {
    public static void main(String[] args) {
        System.out.println(new s1404().numSteps("1101"));
    }
    public int numSteps(String s) {
        if (s.length() == 1)
            return 0;
        int i = s.length() - 1;
        for (; i >= 0 && s.charAt(i) == '1'; i--) ;
        if (i != s.length() - 1)
            return 1 + numSteps(s.substring(0, Math.max(0, i)) + "1" + "0".repeat(s.length() - 1 - i));
        else return 1 + numSteps(s.substring(0, s.length() - 1));
    }
}