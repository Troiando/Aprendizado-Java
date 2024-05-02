package Construtores.Vetores_Arrays.Praticas;

import java.util.Scanner;

/**
 * AT1
 */
public class Exe1_Negativos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N;
        System.out.println("Digite Num de vetor, Maximo 10 ");
        N = sc.nextInt();

        int[] vet = new int[N];

        if (N <= 10) {
            for (int i = 0; i < vet.length; i++) {
                System.out.println("Digite Numeros");
                vet[i] = sc.nextInt();
                System.out.println("");
            }
            for (int i = 0; i < vet.length; i++) {
                if (vet[i] < 0) {
                    System.out.println("Numero Negativos: "+vet[i]);
                }
            }
        } else {
            System.err.println("Valor invalido");

        }
        
    }
}
