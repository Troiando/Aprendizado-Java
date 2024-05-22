package Construtores.For_Vetores.Exemplos.Exemplo2_VetorClass;

import java.util.Scanner;

public class AT1_Class {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Digite quantidade de Vetor: ");
        n = sc.nextInt();

        Class_Vetor[] vect = new Class_Vetor[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();

            vect[i] = new Class_Vetor(name, price);

        }

        double sum = 0.0;

        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }
        double avg = sum / n;

        System.out.println(avg);

    }
}
