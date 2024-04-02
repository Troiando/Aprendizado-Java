package ClasseeOrientação.Execicios.exe3;


public class Boletim {
    public String nome;
    public double [] nota;
    public double soma;


    public void Nota(double nota) {
            if (nota <= 35) {
                System.out.println("Nota adicionada");
            }
            else{
                System.out.println("Nota invalida");
                return;
            }
    }

    public double soma(){
        return soma = (nota[1]+nota[0]+nota[2]);
        }
    
    public void valida(double soma){
        if(soma >= 60){
            System.out.println("Pass");
        }
        else{
            System.out.println("Failed");
            System.out.println(soma-100);
        }
    }
}
