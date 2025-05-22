import java.util.Scanner;

public class Transacoes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite o seu saldo inicial: ");
        double saldo = entrada.nextDouble();

        System.out.println("digite o valor do deposito");
        double deposito = entrada.nextDouble();
        System.out.println("digite o valor do deposito");
        deposito = entrada.nextDouble();

        System.out.println("digite o valor do saque: ");
        double saque = entrada.nextDouble();

        saldo = depositar(deposito, saldo);
        saldo = retirar(saldo, saque);

        entrada.close();
    }

    public static double depositar(double deposito, double saldo) {
        saldo = deposito + saldo;
        System.out.println("o deposito foi de:" + deposito);
        System.out.println("saldo atual: " + saldo);
        return saldo;
    }

    public static double retirar(double saldo, double saque) {
        if (saldo < saque) {
            System.out.println("saldo insuficiente para sacar.");
        } else {
            saldo -= saque;
            System.out.println(" o valor sacado foi: " + saque);
        }
        System.out.println("o saldo atual é:" + saldo);
        return saldo;
    }
}