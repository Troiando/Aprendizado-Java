package Construtores.Matriz.Exemplos;

import java.util.Random;
import java.util.Scanner;

public class Matriz_AT1 {
    
    public static void main(String[] args) {
        
        Random random = new Random();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite N: ");
        int N = sc.nextInt();

        int[][] matriz = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = random.nextInt(21) - 10;
            }
        }

        //Diagonal Principal
        for (int i = 0; i < N; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();

        //Numero negativos
        int count = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j]<0) {
                    count++;
                }
            }
        }
        System.out.println("Numeros Negativos: "+ count);


        sc.close();
    }
}
