package Contrato.application;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(sc.nextLine(), fmt);
        System.out.print("Valor do contrato: ");
        Double valor = sc.nextDouble();
        System.out.print("Entre com o numero de parcelass: ");
        int parcelas = sc.nextInt();
        System.out.println("parcelas: ");
        System.out.print(parcelas);

        System.out.println("");
    }
}
