package GrenciadordeProdutos.entities.aplication;

import GrenciadordeProdutos.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("enter product data: ");

        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Price: ");
        double price = sc.nextDouble();
        Product product = new Product(name,price);

        product.setName("Computador");
        System.out.println("updated name:" + product.getName());
        product.setPrice(1200);
        System.out.println("updated price: " + product.getPrice());

        System.out.println();
        System.out.println("Product data: "+ product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("updated data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("updated data: " + product);

         sc.close();

    }
}
