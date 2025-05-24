package logica;
// Escreva um programa que entre com um número e o imprima caso seja maior do que 20.

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int x;
   System.out.println("digite um numero: ");
   x = scanner.nextInt();
   if (x > 20){
       System.out.println("O numero "+ x + " é maior do que 20");
   }else {
       System.out.println("O numero " + x + " é menor do que 20");
   }

}
    }