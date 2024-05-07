package Construtores.Vetores_Arrays.Praticas;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
// aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
// digitado, mostrar a mensagem "NENHUM NUMERO PAR" 

public class Exe8_MediaPares {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int N, contador = 0;
        double soma = 0.0;
        System.out.println("Quantos elementos vai ter o vetor? ");
        N = sc.nextInt();

        int[] vet = new int[N];

        boolean temPar = false; //Inicialmente não tem nenhum par

        for (int i = 0; i < N; i++) {
            System.out.println("\nDigite um numero: ");
            vet[i] = sc.nextInt();
        }

        for (int j = 0; j < vet.length; j++) {
            if (vet[j] % 2 == 0) {
                temPar = true;
                soma += vet[j];
                contador++;
            }
        }
        
        double avg = soma / contador;

        if (temPar) {
            System.out.println("MEDIA DOS PARES = " + avg);
        }else{
            System.out.println("NENHUM NUMERO PAR");
        }
    }
}
