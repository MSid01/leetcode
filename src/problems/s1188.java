package problems;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Semaphore;

/**
 * Design Bounded Blocking Queue
 */
public class s1188 {
    class BoundedBlockingQueue {
        final Semaphore s;
        final Queue<Integer> q;

        public BoundedBlockingQueue(int capacity) {
            q = new ArrayDeque<>(capacity);
            s = new Semaphore(capacity);
        }

        public void enqueue(int element) throws InterruptedException {
            s.acquire();
            q.add(element);
        }

        public int dequeue() throws InterruptedException {
            s.release();
            return q.poll();
        }

        public int size() {
            return q.size();
        }
    }
}
