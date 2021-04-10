package problems;

import java.util.*;

/**
 * Web Crawler
 */
public class s1236 {
    public List<String> crawl(String startUrl, HtmlParser htmlParser) {
        LinkedList<String> r = new LinkedList<>(), q = new LinkedList<>();
        Set<String> seen = new HashSet<>();
        String host = host(startUrl);
        q.add(startUrl);
        seen.add(startUrl);
        while (!q.isEmpty()) {
            String url = q.poll();
            r.add(url);
            for (String newUrl : htmlParser.getUrls(url))
                if (seen.add(newUrl) && host(newUrl).equals(host))
                    q.add(newUrl);
        }
        return r;
    }

    String host(String url) {
        int idx = url.indexOf("/", 7);
        return idx == -1 ? url.substring(7) : url.substring(7, idx);
    }

    interface HtmlParser {
        List<String> getUrls(String url);
    }
}