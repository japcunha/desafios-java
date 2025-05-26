package AreaDoRetangulo.application;

import java.util.Locale;
import java.util.Scanner;
import AreaDoRetangulo.entities.Retangulo;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        Retangulo retg = new Retangulo();


        System.out.println("Digite a altura do retangulo: ");
        retg.altura = scanner.nextDouble();

        System.out.println("Digite a largura do retangulo: ");
        retg.largura = scanner.nextDouble();

        System.out.printf("Area = %.2f%n", retg.area());
        System.out.printf("Perimetro = %.2fn", retg.perimetro());
        System.out.printf("Diagonal = %.2f%n", retg.diagonal());

        scanner.close();

    }
}





