package ClasseO_Static.Exe_3Partes.Parte2_comClasse;

public class MedidaCircular {
    public double r;
    public double pi = 3.14;

    public double circumference(){
        return 2*(pi*r);
    }

    public double volume(){
        return 4*pi*Math.pow(r, 3)/3;
    }

}
