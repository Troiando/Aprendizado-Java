package Construtores.For_Vetores.Praticas.Exe_Pensionato;

import java.util.Scanner;

/**
 * Exe_Pensionato
 */
public class Exe_Pensionato {
    public static void main(String[] args) {
        
        Rent rent = new Rent();
         Rent[] quarto = new Rent[10];
        

        int N;
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidades de quartos:  ");
        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            String email = sc.nextLine();
            int ROOM = sc.nextInt();
    
            quarto[ROOM] = new Rent(name,email);
        }

        for (int i = 0; i < 10; i++) {
            
        }
        

    
    }    
}