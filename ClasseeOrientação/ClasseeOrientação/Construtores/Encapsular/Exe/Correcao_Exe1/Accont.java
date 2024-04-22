package Construtores.Encapsular.Exe.Correcao_Exe1;

public class Accont {

    private int number;
    private String holder;
    private double balance;

    public Accont(int number, String holder){
        this.number = number;
        this.holder = holder;
    }

    public Accont(int number, String holder, double balance){
        this.balance = balance;
        this.holder = holder;
        this.number = number;
    }


    
}
