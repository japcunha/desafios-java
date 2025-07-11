package Consumer.application;

import Consumer.entities.Product;
import Consumer.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Tv", 50.00));
        list.add(new Product("Tv", 350.00));
        list.add(new Product("Tv", 90.00));

        list.forEach(new PriceUpdate());
        list.forEach(System.out::println);

    }
}
