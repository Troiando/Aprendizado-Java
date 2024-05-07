package Construtores.Vetores_Arrays.Praticas;

import java.util.Locale;
import java.util.Scanner;

// Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
// terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
// o vetor C gerado. 


public class Exe6_SomaVetores {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        StringBuilder lista = new StringBuilder();  //Cria lista

        Scanner sc = new Scanner(System.in);
        int N;
        System.out.println("Quantos numeros voce vai digitar? ");
        N = sc.nextInt();

        int[] vetA = new int[N];
        int[] vetB = new int[N];
        int[] vetC = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.println("\nDigite o numero A: ");
            vetA[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            System.out.println("\nDigite o numero B: ");
            vetB[i] = sc.nextInt();
        }
        for (int j = 0; j < N; j++) {
            vetC[j] =vetA[j]+vetB[j];
            lista.append(vetC[j]).append("  \n") ;
        }
        System.out.println("Vetor Resultante: \n"+lista.toString());
    
    }

}
