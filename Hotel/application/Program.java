package Hotel.application;

import Hotel.entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.println("how many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1;i <= n; i++) {
            System.out.println();
            System.out.println("rent: " + i + ":");
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("email: ");
            String email = sc.next();
            System.out.println("room; ");
            int roomNumber = sc.nextInt();

            Rent rent = new Rent(name, email);
            vect[roomNumber] = rent;
        }
            //ou vect[roomNumber] = new Rent(name, email);
        System.out.println();
        System.out.println("Busy rooms: ");
            for (int i = 0; i < 10;i++){
                if (vect[i] != null){
                    System.out.println(i + ":" + vect[i]);

            }

        }
        sc.close();

    }
}
