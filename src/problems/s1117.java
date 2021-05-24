package problems;

import java.util.concurrent.Semaphore;

/**
 * Building H2O
 */
public class s1117 {
    class H2O {
        final Semaphore h = new Semaphore(2), o = new Semaphore(0);

        public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
            h.acquire();
            releaseHydrogen.run();
            o.release();
        }

        public void oxygen(Runnable releaseOxygen) throws InterruptedException {
            o.acquire(2);
            releaseOxygen.run();
            h.release(2);
        }
    }
}