package logica;

/* Faça um programa que receba a idade de um nadador e mostre sua categoria, usando as regras a seguir.
 * Para idade inferior a 5, deverá mostrar a mensagem "nenhuma".
 * Categorias: infantil (5 a 7 anos), juvenil (8 a 10), adolescente (11 a 15), adulto (16 a 30) ou sênior (acima de 30 anos). */


import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int idade;

        System.out.println("idade do nadador: ");
        idade = scanner.nextInt();

        if (idade < 5){
            System.out.println("Nenhuma");

        }else if(idade <= 7){
            System.out.printf("Idade do nadador é %d anos, sua categoria é intanfil",idade);
        }else if (idade <= 10){
            System.out.printf("Idade do nadador é %d anos, sua categria é juvenil",idade);
        }else if( idade <= 15){
            System.out.printf("Idade do nadador é %d anos, sua categoria é adolescente", idade);
        }else if(idade <= 30) {
            System.out.printf("Idade do nadador é %d anos, sua categoria é adulto", idade);
        }else{
            System.out.printf("Idade do nadador é %d anos, sua categoria é sênior", idade);
        }
            scanner.close();
    }
}
