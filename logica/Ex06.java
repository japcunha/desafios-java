package logica;
// Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$).
// O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário.

 import java.util.Scanner;

public class Ex06 {
    public static void main (String args){
        Scanner scanner = new Scanner(System.in);

        double real;
        double dolar;
        double cotacao;

        System.out.println("digite o valor em reais: ");
        real = scanner.nextDouble();

        System.out.println("digite a cotação do dolar: ");
        cotacao = scanner.nextDouble();

        dolar = real / cotacao;

        System.out.printf("você possui: " + dolar + "dolares");
        scanner.close();
    }
}
