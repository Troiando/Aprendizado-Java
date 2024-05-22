package Construtores.Listas.Exemplos;

import java.util.*;

public class linked {

    public static void main(String[] args) {

            LinkedList<String> sony = new LinkedList<String>();

            sony.add("PlayStation 1");
            sony.add("PlayStation 2");
            sony.add("PlayStation 3");

            System.out.println(sony);
            System.out.println(sony.removeLast());
    }
    
}
