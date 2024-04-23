package Construtores.Encapsular.Exe.Correcao_Exe1;

public class Accont {

    private int number;
    private String holder;
    private double balance;

    public Accont(int number, String holder){
        this.number = number;
        this.holder = holder;
    }

    public Accont(int number, String holder, double initialDeposit){
        this.holder = holder;
        this.number = number;
        deposit(initialDeposit);
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount + 5.0;
    }

    public String toString(){
       return "Account data:\n"
        + "Conta: " + number
        + ", "
        + "Titular: " +holder
        + ", "
        + "Saldo Total: " + String.format("%.2f", balance);
    }
    
}
