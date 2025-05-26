package AumentoDeSalario.application;
import java.util.Scanner;
import java.util.Locale;
import AumentoDeSalario.entities.Employee;
public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         Employee emp = new Employee();

        System.out.println("Nome:");
        String name = scanner.nextLine();

        System.out.println("Gross salary: ");
         emp.grossSalary = scanner.nextDouble();

        System.out.println("Tax:");
        emp.tax = scanner.nextDouble();

        System.out.println();
        System.out.println("Employee: " + emp);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = scanner.nextDouble();
        emp.increaseSalary(percentage);
        System.out.println();
        System.out.println("Updated data: " + emp);
        scanner.close();


    }
}
