package ClasseeOrientação.test2;

import java.util.Scanner;

public class AT1 {
   
    public static void main(String[] args) {
        Triangulo y,x;
        double p,areax,areay;

        x = new Triangulo();
        y = new Triangulo();
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a, b e c do Triangulo x respectivamente");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        System.out.println("Digite a, b e c do Triangulo y respectivamente");

        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        areax = x.area();
        areay = y.area();

        System.out.printf("Area x = " + areax, " \rArea y = " + areay);

        if (areax > areay) {
            System.out.println(" \rTriangulo X é maior");
            System.out.print(areax);
        } else if (areax < areay) {
            System.out.println(" \rTriangulo Y é maior ");
            System.out.print(areay);
        } else {
            System.out.println(" \rAmbos tem o a mesma medida de area ");
        }
    
    }
}
