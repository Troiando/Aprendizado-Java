package Construtores.Vetores_Arrays.Praticas;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
// devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
// da pessoa mais velha. 


public class Exe9_MaisVelho {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int N;
        double maior = 0.0;
        System.out.println("Quantas pessoas serão digitadas? ");
        N = sc.nextInt();
        sc.nextLine();

        String[] nome = new String[N];
        int[] idade = new int[N];
        String nomeVelho = null;

        for (int i = 0; i < N; i++) {
            System.out.println("\nDados da " + (i + 1) + " pessoa: ");
            System.out.println("Digite o nome");
            nome[i] = sc.nextLine();

            System.out.println("Digite o Idade");
            idade[i] = sc.nextInt();

            sc.nextLine();
        }

        for (int i = 0; i < N; i++) {
            if (idade[i] > maior) {
                maior = idade[i];
                nomeVelho = nome[i];
            }
        }
        System.out.println("PESSOA MAIS VELHA: "+nomeVelho);

    }

}
