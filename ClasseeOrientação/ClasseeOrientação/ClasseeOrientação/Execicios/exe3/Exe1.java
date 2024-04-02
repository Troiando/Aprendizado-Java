package ClasseeOrientação.Execicios.exe3;

import java.util.Locale;
import java.util.Scanner;

/**
 * Exe1
 */
public class Exe1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Boletim boletim = new Boletim();
        double[] nota,valida;
        nota = new double[3];


        boletim.nota = nota;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite seu Nota " + (i + 1) + "º Tri");
            nota[i] = sc.nextDouble();
            boletim.Nota(nota[i]);
        }

        System.out.println("" + boletim.nota[0]);
        System.out.println("" + boletim.nota[1]);
        System.out.println("" + boletim.nota[2]);

        System.out.println(boletim.soma());

        boletim.valida(boletim.soma());

    }
}