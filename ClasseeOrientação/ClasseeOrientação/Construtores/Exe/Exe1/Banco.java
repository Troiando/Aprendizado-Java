package Construtores.Exe.Exe1;

import java.util.Scanner;

public class Banco {
    private String nomeTitular;
    private double numConta, saldoCont, saldoInicial;
    public Scanner sc = new Scanner(System.in);

    public Banco() {
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getNumConta() {
        return numConta;
    }

    public void setNumConta(double numConta) {
        this.numConta = numConta;
    }

    public double getSaldoCont() {
        return saldoCont;
    }

    public void setSaldoCont(double saldoCont) {
        this.saldoCont = saldoCont;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public void cadastrar(String nomeTitular, int numConta) {
        this.nomeTitular = sc.nextLine();
        this.numConta = sc.nextInt();
    }

    public void depositoInicial(double saldoInicial) {
        saldoInicial = +saldoCont;
        System.out.println("Deposito inicial feito com Sucesso");
    }

    public boolean verificarResp(String resp) {
        resp = sc.nextLine();
    
        if (resp.isEmpty()) {
            System.err.println("String não preenchida");
            System.out.println("Prosseguir sem depósito inicial");
            return false;
        } else if (resp.toLowerCase().equals("s")) {
            System.out.println("Digite o valor");
            return true;
        } else if (resp.toLowerCase().equals("n")) {
            System.out.println("Prosseguir sem depósito inicial");
            return true;
        } else {
            System.err.println("Resposta inválida");
            return false;
        }
    }

}
