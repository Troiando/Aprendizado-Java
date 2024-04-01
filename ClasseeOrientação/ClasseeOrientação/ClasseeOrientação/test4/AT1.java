package ClasseeOrientação.test4;

import java.util.Locale;
import java.util.Scanner;

public class AT1 {

    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Retangulo retangulo = new Retangulo();
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Digite o height");
        retangulo.height = sc.nextDouble();
        System.out.println("Digite o width");
        retangulo.width = sc.nextDouble();
        System.out.println("");

        //Resultado
        System.out.println("Area: "+retangulo.Area());
        System.out.println("Perimetro: "+retangulo.Perimeter());
        System.out.println("Diagonal: "+retangulo.Diagonal());
  
    }
}
