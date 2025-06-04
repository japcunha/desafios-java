package SystemOfLibrary.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
         list.add("Maria");
         list.add("Alex");
         list.add("Bob");
         list.add("Anna");
         list.add(2,"Marco");

        System.out.println(list.size());
        list.remove("Anna");

         for (String x : list){
            System.out.println(x);

         }
        System.out.println("-----------------");
         list.remove(1);
         list.removeIf(x -> x.charAt(0) == 'M');
         for (String x : list){
             System.out.println(x);
    }
        System.out.println("------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of marco: " + list.indexOf("Marco"));
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result ){
            System.out.println(x);
        }
        System.out.println("--------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
        //list.stream() cria um Stream a partir da lista list.
        //
        //.filter(x -> x.charAt(0) == 'A') filtra os elementos que começam com a letra 'A'.
        //
        //.findFirst() pega o primeiro elemento que satisfaz a condição.
        //
        //.orElse(null) retorna esse elemento, ou null se nenhum for encontrado.

        // o que é um stream? é uma 'linha de montagem' onde vc pode encadear operações.
}
}
