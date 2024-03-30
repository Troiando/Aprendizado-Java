package ClasseeOrientação.test2;

//Problema usando apenas uma classe, sem orientação O.B

import java.util.Scanner;

public class AT1_semclasse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double xa, xb, xc, ya, yb, yc;
        double xp, yp, yarea, xarea;

        System.out.println("Digite a, b e c do Triangulo x respectivamente");

        xa = scanner.nextDouble();
        xb = scanner.nextDouble();
        xc = scanner.nextDouble();

        System.out.println("Digite a, b e c do Triangulo y respectivamente");
        ya = scanner.nextDouble();
        yb = scanner.nextDouble();
        yc = scanner.nextDouble();

        xp = (xa + xb + xc) / 2;
        yp = (ya + yb + yc) / 2;

        xarea = Math.sqrt(xp * (xp - xa) * (xp - xb) * (xp - xc));
        yarea = Math.sqrt(yp * (yp - ya) * (yp - yb) * (yp - yc));

        System.out.printf("Area x = " + xarea, " \rArea y = " + yarea);

        if (xarea > yarea) {
            System.out.println(" \rTriangulo X é maior");
            System.out.print(xarea);
        } else if (xarea < yarea) {
            System.out.println(" \rTriangulo Y é maior ");
            System.out.print(yarea);
        } else {
            System.out.println(" \rAmbos tem o a mesma medida de area ");
        }
    }
}