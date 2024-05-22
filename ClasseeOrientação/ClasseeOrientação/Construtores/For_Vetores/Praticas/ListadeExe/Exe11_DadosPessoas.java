package Construtores.For_Vetores.Praticas.ListadeExe;

import java.util.Locale;
import java.util.Scanner;

// Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
// que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
// de homens. 

public class Exe11_DadosPessoas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int N;
        double soma = 0.0;
        System.out.println("Quantas pessoas serão digitadas? ");
        N = sc.nextInt();
        sc.nextLine();

        String[] genero = new String[N];
        double[] alt = new double[N];
        boolean valido = false;
        String entrada = "";

        int contador = 0;


        for (int i = 0; i < N; i++) {
            System.out.println("\nDados da " + (i + 1) + " pessoa: ");
            System.out.println("Digite o Genero");
            genero[i] = sc.nextLine();
            if(entrada.equals("M")||entrada.equals("F")){
                valido = true;
            }else{
                System.out.println("A entrada deve ser 'M' ou 'F'. Tente novamente.");
                sc.close();
            }


            System.out.println("Digite o Altura");
            alt[i] = sc.nextDouble();

            sc.nextLine();

        for (int j = 0; j < N; j++) {
            soma += alt[j];
        }

        double avg = soma / N;
        System.out.println("Altura media: " + avg);

        double porc = (double) contador / N * 100;
        System.out.println("Pessoas com menos de 16 anos: " + porc + "%");
        

        }

    }

}
