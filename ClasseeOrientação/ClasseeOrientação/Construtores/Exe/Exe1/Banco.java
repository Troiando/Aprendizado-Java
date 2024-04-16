package Construtores.Exe.Exe1;

import java.util.Scanner;

public class Banco {
    private String nomeTitular;
    private double numConta, saldoCont, deposito;
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

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }
  

    // Funções

    public void cadastrar(String nomeTitular, int numConta, double depositoInicial) {
        this.nomeTitular = nomeTitular;
        this.numConta = numConta;
        this.deposito = depositoInicial;
        System.out.println("\nCadastro feito com sucesso");
    }

    //Soma de Saldo da conta
    public void somaSaldo(double deposito) {
        this.saldoCont += deposito;
        System.out.println("\nDeposito feito com Sucesso\n");
    }

    //Visualizar Saldo
    public void verSaldo(){
        System.out.println("Saldo Total: "+this.saldoCont);
    }

    //Verificador de S/N
    public boolean verificarResp(String resp) {
        resp = sc.nextLine();

        if (resp.isEmpty()) {
            System.err.println("Valor não preenchido");
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

   

}
