package Construtores.Vetores_Arrays.Praticas;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
// no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
// os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
// igual a 6.0 (seis). 


public class Exe10_Aprovados {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        StringBuilder lista = new StringBuilder();  //Cria lista

        Scanner sc = new Scanner(System.in);
        int N;
        System.out.println("Quantas pessoas serão digitadas? ");
        N = sc.nextInt();
        sc.nextLine();

        String[] nome = new String[N];
        double[] nota1 = new double[N];
        double[] nota2 = new double[N];
        double[] mediaFinal = new double[N];
        
        for (int i = 0; i < N; i++) {
            System.out.println("\nDigite nome, primeira e segunda nota do "+ (1+i)+ " aluno: ");
            nome[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
            sc.nextLine();

        }
        for (int j = 0; j < N; j++) {
            mediaFinal[j] += (nota1[j]+nota2[j])/2;
            if (mediaFinal[j]>=6.0) {
                lista.append((nome[j])).append("  ") ;
                
            }
        }
    
        System.out.println("Alunos aprovados: \n" + lista.toString());
        
    }

}
