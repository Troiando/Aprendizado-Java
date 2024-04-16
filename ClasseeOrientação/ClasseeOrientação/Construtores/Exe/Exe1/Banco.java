package Construtores.Exe.Exe1;

import java.util.Scanner;

public class Banco {
    private String nomeTitular;
    private double numConta, saldoCont, depositoInicial;
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

    public double getDepositoInicial() {
        return depositoInicial;
    }

    public void setDepositoInicial(double depositoInicial) {
        this.depositoInicial = depositoInicial;
    }
  

    // Funções

    public void cadastrar(String nomeTitular, int numConta, double saldoInicial) {
        this.nomeTitular = nomeTitular;
        this.numConta = numConta;
        this.depositoInicial = saldoInicial;
        System.out.println("Cadastro feito com sucesso");
    }

    public void saldoTotal(double saldoInicial) {
        saldoInicial =+ saldoCont;
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
            return false;
        } else {
            System.err.println("Resposta inválida");
            return false;
        }
    }

    public String test() {
        return nomeTitular;
    }

    public double test2() {
        return depositoInicial;
    }

}
