package ClasseO_Static.Exe_3Partes.Parte1_semClasse;

import java.util.Scanner;

//Calcular Circuference,volume

public class AT1 {

    public static final double PI = 3.14;

    public static void main(String[] args) {
    
    double r,volume,circumference; 
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o Radius do Circulo");
    r = sc.nextDouble();

    circumference = 2*(PI*r);
    volume = 4*PI*Math.pow(r, 3)/3;
    
    System.out.println("Enter Radius"+r);
    System.out.println("Circumference "+ circumference);
    System.out.println("Volume "+ volume);
    System.out.println("PI value "+ PI);





    

    
    
    
    
    
    
    
    }
}
