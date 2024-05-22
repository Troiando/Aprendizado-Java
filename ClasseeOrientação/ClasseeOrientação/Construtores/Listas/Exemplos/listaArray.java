package Construtores.Listas.Exemplos;

import java.util.List;
import java.util.ArrayList;

public class listaArray {
    
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();

        list.add("Marcos");
        list.add("Luiz");
        list.add("Paulo");

        //Adiciona elemento na posição 
        list.add(0,"Carlos");

        for (String nomes : list) {
            System.out.println(nomes);
        }

        System.out.println("============");

        //Predicado
        list.removeIf(x -> x.charAt(0)=='M');
        System.out.println(list);

        //Posição que o nome esta na lista
        System.out.println("============");
        System.out.println("Index of Luiz: "+ list.indexOf("Luiz"));

        //List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect();


    }
}
