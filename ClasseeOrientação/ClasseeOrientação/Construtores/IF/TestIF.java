package Construtores.IF;

import java.util.*;
public class TestIF {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        
        if(N % 2 != 0){
            System.out.println("Impar");
        }
        else{
            System.out.println("Par");
        }
        if(N % 2 == 0 && N>=2 || N<=5){
            System.out.println("Nao Passou");
        }else if(N % 2 == 0 && N>=6 || N<=20){
            System.out.println("Passou");
        }else if(N % 2 == 0 && N>20 ){
            System.out.println("Nao Passou");
        }
        scanner.close();
    }
}


