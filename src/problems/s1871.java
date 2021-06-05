package problems;

public class s1871 {
    public boolean canReach(String s, int minJump, int maxJump) {
        boolean[] dp = new boolean[s.length()];
        dp[0] = true;
        for (int i = 1, zeroes = 0; i < s.length(); i++) {
            if (i >= minJump && dp[i - minJump])
                zeroes++;
            if (i > maxJump && dp[i - maxJump - 1])
                zeroes--;
            dp[i] = zeroes > 0 && s.charAt(i) == '0';
        }
        return dp[s.length() - 1];
    }
}