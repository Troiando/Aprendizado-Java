package ClasseO_Static.Exe_3Partes.Parte2_comClasse;

import java.util.Scanner;

//Calcular Circuference,volume

public class AT1 {
    
    public static void main(String[] args) {
    
    MedidaCircular medidaCircular = new MedidaCircular(); 
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o Radius do Circulo");
    medidaCircular.r = sc.nextDouble();
    
    System.out.println("Enter Radius"+ medidaCircular.r);
    System.out.println("Circumference "+ medidaCircular.circumference());
    System.out.println("Volume "+ medidaCircular.volume());
    System.out.println("PI value "+ medidaCircular.pi);
    }
}