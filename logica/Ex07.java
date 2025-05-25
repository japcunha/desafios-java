package logica;
// Faça um programa que receba um valor que foi depositado e exiba o valor com rendimento após um mês.
// Considere fixo o juro da poupança em 0.70% a. m.

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor;
        double juros;
        double rendimento;


        System.out.println("valor do deposito: ");
        valor = scanner.nextDouble();


       juros = (valor / 0.70)/ 100;

       rendimento = juros + valor;

       System.out.println("Rendmento da conta poupança em um mês foi igual a: "+ rendimento + "reais");

       scanner.close();


    }
}
