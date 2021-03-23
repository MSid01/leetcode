package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Design Authentication Manager
 */
public class s1797 {
    class AuthenticationManager {
        final int timeToLive;
        final Map<String, Integer> tokens = new HashMap<>();

        public AuthenticationManager(int timeToLive) {
            this.timeToLive = timeToLive;
        }

        public void generate(String tokenId, int currentTime) {
            tokens.put(tokenId, currentTime + timeToLive);
        }

        public void renew(String tokenId, int currentTime) {
            if (tokens.getOrDefault(tokenId, 0) > currentTime)
                tokens.put(tokenId, currentTime + timeToLive);
        }

        public int countUnexpiredTokens(int currentTime) {
            int r = 0;
            for (String token : tokens.keySet())
                if (tokens.get(token) > currentTime)
                    r++;
            return r;
        }
    }
}
