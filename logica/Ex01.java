package logica;
// Escrever um programa que receba dois números e ao final mostre a soma, subtração, multiplicação e 
//a divisão dos números lidos.
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b;
        int soma,mult,sub,div;

        System.out.println("digite o primeiro valor: ");
        a = scanner.nextInt();

        System.out.println("digite o segundod valor:");
        b = scanner.nextInt();

        soma = a + b;
        mult = a * b;
        sub = a - b;
        div = a / b;

        System.out.println("a soma é "+ soma);
        System.out.println("a multiplicação é: "+ mult);
        System.out.println("a subtração é: " + sub);
        System.out.println("a divisão é: "+ div);

        scanner.close();

    }
}
