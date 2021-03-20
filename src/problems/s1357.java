package problems;

import java.util.HashMap;

/**
 * Apply Discount Every n Orders
 */
public class s1357 {
    class Cashier {
        final HashMap<Integer, Integer> m = new HashMap<>();
        final int n, discount;
        int i = 0;

        public Cashier(int n, int discount, int[] products, int[] prices) {
            this.n = n;
            this.discount = discount;
            for (int i = 0; i < products.length; i++)
                m.put(products[i], prices[i]);
        }

        public double getBill(int[] product, int[] amount) {
            double price = 0;
            for (int i = 0; i < product.length; i++)
                price += m.get(product[i]) * amount[i];
            if (++i == n) {
                price -= price * discount / 100.0;
                i = 0;
            }
            return price;
        }
    }
}