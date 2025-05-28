package vetores1;


import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {


    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("quantos numeros você vai digitar?");
    int n = sc.nextInt();

    int[] vet = new int[n];

    for (int i =0;i < n;i ++){
        System.out.println("digite um numero: ");
        vet[i] = sc.nextInt();
    }
        System.out.println("numero negativos: ");
        for(int i = 0;i < n;i++){
            if (vet[i] < 0){
                System.out.println(vet[i]);

            }

        }
        sc.close();

    }
}