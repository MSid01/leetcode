package problems;

import java.util.concurrent.Semaphore;

/**
 * Print FooBar Alternately
 */
public class s1115 {
    class FooBar {
        private int n;
        Semaphore foo = new Semaphore(0), bar = new Semaphore(1);

        public FooBar(int n) {
            this.n = n;
        }

        public void foo(Runnable printFoo) throws InterruptedException {
            for (int i = 0; i < n; i++) {
                bar.acquire();
                printFoo.run();
                foo.release();
            }
        }

        public void bar(Runnable printBar) throws InterruptedException {
            for (int i = 0; i < n; i++) {
                foo.acquire();
                printBar.run();
                bar.release();
            }
        }
    }
}