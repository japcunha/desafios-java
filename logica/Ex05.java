package logica;
// Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.
// A fórmula de conversão é:  F= (9*C+160) / 5,  sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

            double c,f;

            System.out.println("Digite a temperatura em graus Celsius: ");
            c = scanner.nextDouble();

            f = (9 * c + 160) / 5;
            System.out.println("a temperatura convertida para Fahrenheit é :" + f + ":F ");

            scanner.close();

    }

}
