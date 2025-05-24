package logica;
//Escrever um programa para determinar o consumo médio de um automóvel,
//sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto.
import java.util.Scanner;

public class Ex02 {
//DISTANCIA E COMBUSTIVEL
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double consumoMedio;
    double km;
    double combustivel;

    System.out.println("quilometros percorridos: ");
    km = scanner.nextDouble();

    System.out.println("quantidade em litros de combustivel: ");
    combustivel = scanner.nextDouble();

    consumoMedio = km / combustivel;

    System.out.println("O consumo médio do automóvel foi: " + consumoMedio + "litros por km percorrido.");




}
}
