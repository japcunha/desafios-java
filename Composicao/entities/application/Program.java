package Composicao.entities.application;

import Composicao.entities.Client;
import Composicao.entities.OrderItem;
import Composicao.entities.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String args[]) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Client cli = new Client("maria", "maria@gmail.com", sdf.parse("20/10/1999 "));
        System.out.println(cli);

        sc.close();


    }
}
