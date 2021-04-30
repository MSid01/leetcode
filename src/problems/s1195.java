package problems;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

/**
 * Fizz Buzz Multithreaded
 */
public class s1195 {
    class FizzBuzz {
        private int n;
        Semaphore fizz = new Semaphore(0), buzz = new Semaphore(0), fizzbuzz = new Semaphore(0), num = new Semaphore(1);

        public FizzBuzz(int n) {
            this.n = n;
        }

        public void fizz(Runnable printFizz) throws InterruptedException {
            for (int k = 3; k <= n; k += 3)
                if (k % 5 != 0) {
                    fizz.acquire();
                    printFizz.run();
                    releaseLock(k + 1);
                }
        }

        public void buzz(Runnable printBuzz) throws InterruptedException {
            for (int k = 5; k <= n; k += 5)
                if (k % 15 != 0) {
                    buzz.acquire();
                    printBuzz.run();
                    releaseLock(k + 1);
                }
        }

        public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
            for (int k = 15; k <= n; k += 15) {
                fizzbuzz.acquire();
                printFizzBuzz.run();
                releaseLock(k + 1);
            }
        }

        public void number(IntConsumer printNumber) throws InterruptedException {
            for (int k = 1; k <= n; k++)
                if (k % 3 != 0 && k % 5 != 0) {
                    num.acquire();
                    printNumber.accept(k);
                    releaseLock(k + 1);
                }
        }

        void releaseLock(int n) {
            if (n % 3 == 0 && n % 5 != 0)
                fizz.release();
            else if (n % 5 == 0 && n % 3 != 0)
                buzz.release();
            else if (n % 15 == 0)
                fizzbuzz.release();
            else num.release();
        }
    }
}
