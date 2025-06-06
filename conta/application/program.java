package conta.application;

import conta.entities.Account;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("ENTER ACOUNT NUMBER: ");
        int number = sc.nextInt();

        System.out.print("ENTER ACOUNT HOLDER: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.println("IS THERE AN INITIAL DEPOSIT (Y/N");
        char response = sc.next().charAt(0);

        if (response == 'y') {
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number,holder,initialDeposit);
        }
        else{
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);
        sc.close();
    }

}
