package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Design Browser History
 */
public class s1472 {
    class BrowserHistory {
        final List<String> urls = new ArrayList<>();
        int lastIdx = 0, currIdx = 0;

        public BrowserHistory(String homepage) {
            urls.add(homepage);
        }

        public void visit(String url) {
            currIdx++;
            lastIdx = currIdx;
            urls.add(lastIdx, url);
        }

        public String back(int steps) {
            currIdx = Math.max(currIdx - steps, 0);
            return urls.get(currIdx);
        }

        public String forward(int steps) {
            currIdx = Math.min(currIdx + steps, lastIdx);
            return urls.get(currIdx);
        }
    }
}