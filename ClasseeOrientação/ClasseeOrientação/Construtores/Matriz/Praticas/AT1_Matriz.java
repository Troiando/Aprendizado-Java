package Construtores.Matriz.Praticas;

import java.util.Random;
import java.util.Scanner;

public class AT1_Matriz {
    
    public static void main(String[] args) {
        
        Random random = new Random();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite M: ");
        int M = sc.nextInt();
        System.out.println("Digite N: ");
        int N = sc.nextInt();

        int[][] matriz = new int[M][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = random.nextInt(21) - 10;
            }
        }

        //Imprimir Matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+"   ");
            }
            System.out.println();
        }

        System.out.println("Valor a procurar X: ");
        int x = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j]==x) {
                    System.out.println("Position: "+ i +", "+j);

                    // Verifica o elemento à esquerda
                    if (j - 1 >= 0) {
                        System.out.println("Left: " + matriz[i][j - 1]);
                    } else {
                        System.out.println("Left: None");
                    }

                    // Verifica o elemento à direita
                    if (j + 1 < matriz[i].length) {
                        System.out.println("Right: " + matriz[i][j + 1]);
                    } else {
                        System.out.println("Right: None");
                    }

                    // Verifica o elemento acima
                    if (i - 1 >= 0) {
                        System.out.println("Up: " + matriz[i - 1][j]);
                    } else {
                        System.out.println("Up: None");
                    }

                    // Verifica o elemento abaixo
                    if (i + 1 < matriz.length) {
                        System.out.println("Down: " + matriz[i + 1][j]);
                    } else {
                        System.out.println("Down: None");
                    }
                }
            }
        }
        sc.close();
    }
}


