package problems;

/**
 * Defanging an IP Address
 */
public class s1108 {
    public String defangIPaddr(String address) {
        StringBuilder r = new StringBuilder();
        for (char c : address.toCharArray())
            r.append(c == '.' ? "[.]" : c);
        return r.toString();
    }
}
