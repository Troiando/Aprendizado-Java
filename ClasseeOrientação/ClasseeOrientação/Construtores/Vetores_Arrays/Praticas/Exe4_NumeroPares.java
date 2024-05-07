package Construtores.Vetores_Arrays.Praticas;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exe4_NumeroPares {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        DecimalFormat df = new DecimalFormat("#");//Retirar casa decimal
        StringBuilder lista = new StringBuilder();  //Cria lista

        Scanner sc = new Scanner(System.in);
        int N;
        int contador = 0;
        System.out.println("Quantos numeros voce vai digitar? ");
        N = sc.nextInt();

        double[] vet = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.println("\nDigite um numero:");
            vet[i] = sc.nextDouble();
        }
        for (int j = 0; j < vet.length; j++) {
            if (vet[j]%2==0) {
                contador++;
                 lista.append(df.format(vet[j])).append("  ") ;
            }
        }
       
       System.out.println("Numeros pares: \n"+lista.toString());
        System.out.println("Quantidade de pares: "+contador);
        
    }

}
