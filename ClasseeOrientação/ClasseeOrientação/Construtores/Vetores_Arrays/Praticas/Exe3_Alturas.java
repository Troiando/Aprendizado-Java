package Construtores.Vetores_Arrays.Praticas;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
// tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
// bem como os nomes dessas pessoas caso houver. 

public class Exe3_Alturas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int N;
        double soma = 0.0;
        System.out.println("Quantas pessoas serão digitadas? ");
        N = sc.nextInt();
        sc.nextLine();

        String[] nome = new String[N];
        int[] idade = new int[N];
        double[] alt = new double[N];
        int contador = 0;

        for (int i = 0; i < N; i++) {
            System.out.println("\nDados da " + (i + 1) + " pessoa: ");
            System.out.println("Digite o nome");
            nome[i] = sc.nextLine();

            System.out.println("Digite o Idade");
            idade[i] = sc.nextInt();
            System.out.println("Digite o Altura");
            alt[i] = sc.nextDouble();

            sc.nextLine();

            if (idade[i] < 16) {
                contador++;
            }
            System.out.println("Nome: " + nome[i] + " Idade: " + idade[i] + "Altura: " + alt[i]);
        }
        for (int j = 0; j < N; j++) {
            soma += alt[j];
        }

        double avg = soma / N;
        System.out.println("Altura media: " + avg);

        double porc = (double) contador / N * 100;
        System.out.println("Pessoas com menos de 16 anos: " + porc + "%");
        for (int i = 0; i < N; i++) {
            if (idade[i] < 16) {
                System.out.println(nome[i]);
            }

        }

    }

}
