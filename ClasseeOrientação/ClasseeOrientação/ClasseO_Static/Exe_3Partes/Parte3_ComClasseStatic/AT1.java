package ClasseO_Static.Exe_3Partes.Parte3_ComClasseStatic;

import java.util.Scanner;

//Calcular Circuference,volume

public class AT1 {
    
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o Radius do Circulo");
        Calculator.r = sc.nextDouble();
    
    System.out.println("Enter Radius: "+ Calculator.r);
    System.out.println("Circumference "+ Calculator.circumference());
    System.out.println("Volume "+ Calculator.volume());
    System.out.println("PI value "+ Calculator.pi);
    }
}
    