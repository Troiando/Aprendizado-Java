package Construtores.For_Vetores.Exemplos.Exemplo1_Vetor;

import java.util.Scanner;

/**
 * AT1
 */
public class AT1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double soma = 0.0;
        int valor;

        System.out.println("Digite quantidade de Vetor: ");
        valor = sc.nextInt();
        double[] vet = new double[valor];

        for (int i = 0; i < valor; i++) {
            System.out.println("\nDigite o numero: " + (i + 1));
            vet[i] = sc.nextDouble();
        }
        for (int j = 0; j < vet.length; j++) {
            soma+= vet[j];
        }
        
        double avg = soma/valor;
        
        System.out.println(avg);

    }
}