package Construtores.For_Vetores.Praticas.ListadeExe;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
// mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
// os elementos do vetor que estejam abaixo da média, com uma casa decimal cada

public class Exe7_AbaixodaMedia {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int N;
        double soma = 0.0;
        System.out.println("Quantos elementos vai ter o vetor? ");
        N = sc.nextInt();

        double[] vet = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.println("\nDigite um numero: ");
            vet[i] = sc.nextDouble();
        }
        for (int j = 0; j < vet.length; j++) {
            soma += vet[j];
            System.out.println("Valores: " + vet[j]);
        }
        double avg = soma / N;

        System.out.println("\nMedia: " + avg);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] <= avg) {
                System.out.println(vet[i]);
            }
        }

    }

}
