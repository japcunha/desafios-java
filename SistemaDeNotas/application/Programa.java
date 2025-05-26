package SistemaDeNotas.application;

import java.util.Locale;
import java.util.Scanner;
import SistemaDeNotas.entity.Aluno;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

       aluno.nome = scanner.nextLine();
       aluno.grade1 = scanner.nextDouble();
       aluno.grade2 = scanner.nextDouble();
       aluno.grade3 = scanner.nextDouble();

        System.out.printf("grade final: %.2f%n", aluno.gradeFinal());

        if (aluno.gradeFinal() < 60){
            System.out.println("REPROVADO");
            System.out.printf("faltam %.2f pontos%n", aluno.contagemPontos());
        }
        else{
            System.out.println("APROVADO");
        }
            scanner.close();
    }
}
