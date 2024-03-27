package Funtion;

import java.util.Random;

public class test {

    //Função --Gerador Aleatorio--
    public static int gerale(int numA){
        Random gerar = new Random();
        return numA = gerar.nextInt(50);     
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(gerale(i));
        }
        System.out.println();   
    }
}
