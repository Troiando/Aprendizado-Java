package Construtores.For_Vetores.Exemplos.ForEACH;

/**
 * test
 */
public class test {

    public static void main(String[] args) {
        
        String[] vec = new String[] {"Maria", "Bob", "Alex"};

        for (int i = 0; i < vec.length; i++) {
            System.out.println(vec[i]);
        }

        System.out.println("---------------");

        for (String lervect : vec) {
            System.out.println(lervect);
        }


    }
}