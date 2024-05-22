package Construtores.Listas.Praticas;

public class Modulo_Exe1 {

    private int Id;
    private String nome;
    private double salary;


    public Modulo_Exe1(int id, String nome, double salary) {
        Id = id;
        this.nome = nome;
        this.salary = salary;
    }

    public int getId() {
        return Id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void porcentagem(double porcent){
        this.salary += this.salary * (porcent/100);
    }

    @Override
    public String toString() {
        
        return Id + ", "+ nome + ", "+salary;
    }
}
