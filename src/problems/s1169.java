package problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Invalid Transactions
 */
public class s1169 {
    public List<String> invalidTransactions(String[] transactions) {
        List<T> ts = Arrays.stream(transactions).map(T::new).sorted().collect(Collectors.toList());
        boolean[] invalid = new boolean[ts.size()];
        for (int i = 0; i < ts.size(); i++) {
            if (ts.get(i).amount > 1_000)
                invalid[i] = true;
            for (int j = i - 1; j >= 0 && ts.get(i).time - ts.get(j).time <= 60; j--)
                if (ts.get(i).same(ts.get(j))) {
                    invalid[i] = true;
                    invalid[j] = true;
                }
        }
        return IntStream.range(0, ts.size()).filter(i -> invalid[i]).mapToObj(i -> ts.get(i).s).collect(Collectors.toList());
    }

    class T implements Comparable<T> {
        String name, city, s;
        int time, amount;

        T(String s) {
            this.s = s;
            String[] t = s.split(",");
            name = t[0];
            time = Integer.parseInt(t[1]);
            amount = Integer.parseInt(t[2]);
            city = t[3];
        }

        boolean same(T t) { return name.equals(t.name) && !city.equals(t.city);}

        @Override public int compareTo(T o) { return time - o.time;}
    }
}