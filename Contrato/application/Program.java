package Contrato.application;

import Contrato.model.entities.Contract;
import Contrato.model.entities.Installment;
import Contrato.model.services.ContractService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.print("Entre com o numero de parcelass: ");
        int n = sc.nextInt();
        ContractService contractService = new ContractService(null);
        contractService.processContract(contract, n);
        System.out.println("parcelas: ");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }
    }
}
