package Construtores.For_Vetores.Praticas.ListadeExe;

import java.util.Locale;
import java.util.Scanner;

// Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
// - Imprimir todos os elementos do vetor
// - Mostrar na tela a soma e a média dos elementos do vetor 

public class Exe2_SomaVetor {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int N;
        double soma = 0.0;
        System.out.println("Digite Num de vetor, Maximo 10 ");
        N = sc.nextInt();

        double[] vet = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.println("\nDigite o numero: " + (i + 1));
            vet[i] = sc.nextDouble();
        }
        for (int j = 0; j < vet.length; j++) {
            soma+= vet[j];
            System.out.println("Valores: "+vet[j]);
        }
        double avg = soma/N;
        
        System.out.println("Soma: "+soma);
        System.out.println("Media: "+avg);
        
    }

}
