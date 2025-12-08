package savarjisho3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Milk milk = new Milk(
                6,
                LocalDate.of(2026, 1, 3),
                1.5);
        Cake cake = new Cake(
                6,
                LocalDate.of(2026, 1, 3),
                1.5);
        Sandwich sandwich = new Sandwich(
                6,
                LocalDate.of(2026, 1, 3),
                1.5);

        Product[] products = {milk, cake, sandwich, milk, milk, sandwich, cake};
        Shop shop = new Shop(products);

        for (Product product : shop.getProducts()) {
            System.out.println(product.getExpirationDate());
        }
    }
}
