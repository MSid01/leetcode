package problems;

import java.util.TreeSet;

public class s1390 {
        public int sumFourDivisors(int[] nums) {
            int sum = 0;
            for (int n : nums) {
                TreeSet<Integer> divisors = new TreeSet<>();
                for (int d = 2; d * d <= n; d++)
                    if (n % d == 0) {
                        divisors.add(d);
                        if (divisors.size() == 2) {
                            divisors.clear();
                            break;
                        }
                    }
                if (divisors.size() == 1 && n / divisors.first() != divisors.first())
                    sum += 1 + n + divisors.first() + n / divisors.first();
            }
            return sum;
        }
}
