package logica;
// Escrever um programa que leia o nome de um aluno e as notas das tr�s provas que ele obteve no semestre.
// No final informar o nome do aluno e a sua m�dia (aritm�tica).
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String nome;
    Double[] notas = new Double[3];
    Double media = 0.0;
    Double soma = 0.0;
        System.out.println("Nome do aluno: ");
        nome = scanner.next();
        
    for (int i = 0;i < 3;i++){
        System.out.println("Digite sua nota" + (i + 1) + ": ");
        notas[i]= scanner.nextDouble();
    }
    for (double nota : notas){
        soma = soma + nota;
        media = soma / notas.length;
    }
        System.out.println("Nome do aluno:" + nome + "média: " + media);



}
    }