package logica;
/* As maçãs custam R$ 0,50 cada se forem compradas menos de uma dúzia e R$ 0,35 se forem compradas pelo menos doze.
 * Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra. */

import java.util.Scanner;

public class Ex08 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        short quantidade;
        double custo;

        System.out.println("quantidade de maçãs compradas:");
        quantidade = scanner.nextShort();

        if(quantidade < 12){
            custo = quantidade * 0.50;

        }
        else{
            custo = quantidade * 0.35;
        }
        System.out.println("O custo total da compra de " + quantidade + " macãs foi " + custo + " reais.");
        scanner.close();
    }
}
