package ClasseeOrientação.Execicios.exe3;

public class Student {
    public String nome;
    public double[] notaP;
    public double[] notaST;
    public double soma;

    public void NotaP(double notaP) {
            if (notaP <= 30) {
                System.out.println("Nota adicionada");
            } else {
                System.out.println("Nota invalida");
                
            }
    }

    public void NotaST(double notaST) {
        if (notaST <= 35) {
            System.out.println("Nota adicionada");
        } else {
            System.out.println("Nota invalida");
        }
    }

    public double soma() {
        return soma = (notaP[0] + notaST[0] + notaST[1]);
    }

    public void valida(double soma) {
        if (soma >= 60) {
            System.out.println("Pass");
        } else {
            System.out.println("Failed");
            System.out.println(soma - 100);
        }
    }
}
