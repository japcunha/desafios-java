package ImpostoDeRenda.entitiies.application;

import ImpostoDeRenda.entitiies.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the number of taxpayers: ");
        int N = sc.nextInt();
        List<TaxPayer> list = new ArrayList<TaxPayer>();
    }
}
