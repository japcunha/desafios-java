package loja.application;

import loja.entities.ImportedProduct;
import loja.entities.Product;
import loja.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> lista = new ArrayList<>();

        System.out.println("enter the number os products: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i=1;i <= n;i++) {
            System.out.print("nome do produto #" + i);
            String nome = sc.nextLine();
            System.out.print("preço do produto: ");
            Double preco = sc.nextDouble();
            System.out.print("O produto é usado (U) ou importado(I): ");
            char tipo = sc.next().charAt(0);

            if (tipo == 'I' || tipo == 'i') {
                System.out.print("taxa de alfandega: ");
                double taxa = sc.nextDouble();
                sc.nextLine();
                lista.add(new ImportedProduct(nome,preco,taxa));
            }else if(tipo ==  'U' || tipo == 'u'){
                System.out.println("Produto usado.");
                System.out.print("digite a data de fabricação (DD/MM/YYY): ");
                String dataStr = sc.nextLine();

                try {
                    Date data = sdf.parse(dataStr);
                    lista.add(new UsedProduct(nome, preco, data));
                } catch (ParseException e) {
                    System.out.println("Erro: Formato de data inválido.");
                }
            } else {
                lista.add(new Product(nome, preco));
            }
            System.out.println("\nPRICE TAGS:");
            for (Product unidade : lista) {
                System.out.println(unidade.getPrice());
            }

        }

        sc.close();
    }
}
