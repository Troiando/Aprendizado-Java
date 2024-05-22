package Construtores.Listas.Exemplos;

import java.util.List;
import java.util.ArrayList;

public class listaArray {
    
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();

        list.add("Marcos");
        list.add("Luiz");
        list.add("Paulo");

        System.out.println(list);
        System.out.println(list.get(2));
    }
}
