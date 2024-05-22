package Construtores.For_Vetores.Praticas.ListadeExe;

import java.util.Locale;
import java.util.Scanner;

// Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
// o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
// considerando a primeira posição como 0 (zero).

public class Exe5_MaiorPosicao {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int N,posicaoMaior=0 ;
        double maior = 0.0;
        System.out.println("Quantos numeros voce vai digitar? ");
        N = sc.nextInt();

        double[] vet = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.println("\nDigite o numero: ");
            vet[i] = sc.nextDouble();
        }
        for (int j = 0; j < vet.length; j++) {
            if (vet[j] > maior) {
                maior = vet[j];
                posicaoMaior = j;
            }
            System.out.println("Valores: " + vet[j]);
        }

        System.out.println("Maior Valor: " + maior);
        System.out.println("Posicao do Maior valor: "+ posicaoMaior);

    }

}
