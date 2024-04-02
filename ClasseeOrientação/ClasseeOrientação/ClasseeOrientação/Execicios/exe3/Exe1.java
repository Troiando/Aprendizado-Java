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
        Student boletim = new Student();
        double[] notaP,notaST;
        notaP = new double[1];
        notaST = new double[2];

        boletim.notaP = notaP;
        boletim.notaST = notaST;

        for (int i = 0; i < 1; i++) {
            System.out.println("Digite seu Nota " + (i + 1) + "º Tri");
            notaP[i] = sc.nextDouble();
            boletim.NotaP(i);
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Digite seu Nota " + (i + 2) + "º Tri");
            notaST[i] = sc.nextDouble();
            boletim.NotaST(i);
        }

        System.out.println("" + boletim.notaP[0]);
        System.out.println("" + boletim.notaST[0]);
        System.out.println("" + boletim.notaST[1]);

        System.out.println(boletim.soma());

        boletim.valida(boletim.soma());

    }
}