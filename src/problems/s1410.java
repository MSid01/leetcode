package problems;

import java.util.Map;

/**
 * HTML Entity Parser
 */
public class s1410 {
    public String entityParser(String s) {
        Map<String, String> m = Map.of("&quot", "\"", "&apos", "'", "&amp", "&", "&gt", ">", "&lt", "<", "&frasl", "/");
        StringBuilder r = new StringBuilder(s.length()), key = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == '&') {
                r.append(key);
                key = new StringBuilder().append("&");
            } else if (s.charAt(i) == ';') {
                r.append(m.getOrDefault(key.toString(), key.append(";").toString()));
                key.setLength(0);
            } else if (key.length() > 0)
                key.append(s.charAt(i));
            else r.append(s.charAt(i));
        return r.toString();
    }
}