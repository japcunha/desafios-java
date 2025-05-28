package CasaDeCambio.entity;

import java.util.Scanner;
import java.util.Locale;

public class CurrencyConverter{

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Cotação do dolar: ");
        double dolar = sc.nextDouble();

        System.out.println("Valor da compra em dolares: ");
        double valor = sc.nextDouble();

        double resposta = calculo(valor,dolar);
        System.out.printf("valor da compra em REAIS: %.2f%n", resposta);
        sc.close();
    }
    public static double calculo(double valor,double dolar){
        return valor * dolar;
    }
}