package Construtores.Exe.Exe1;

import java.util.Scanner;

public class Banco {
    private String nomeTitular;
    private double saldoCont, deposito, saque;
    private int numConta;
    private Scanner sc;

    public Banco() {
        this.sc = new Scanner(System.in);
    }

    // Get e Set

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
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

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    // Funções/Metodo

    // Cadastrar conta
    public void cadastrar(int numConta, String nomeTitular, double depositoInicial) {
        this.nomeTitular = nomeTitular;
        this.numConta = numConta;
        this.deposito = depositoInicial;
        System.out.println("\nCadastro feito com sucesso\n");
    }

    // Soma de Saldo da conta
    public void somaSaldo(double deposito) {
        this.saldoCont += deposito;
        System.out.println("\nDeposito feito com Sucesso\n");
    }

    // Saque
    public void saqueSub(double saque) {
        this.saldoCont -= saque;
        System.out.println("\nSaque feito com Sucesso\n");
    }

    // Verificador de S/N
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

    // Visualizar
    public void visualizar(int numConta) {
        this.numConta = numConta;
        System.out.println("Account data:\n"
                + "Conta: " + this.numConta
                + ", "
                + "Titular: " + this.nomeTitular
                + ", "
                + "Saldo Total: " + String.format("%.2f", this.saldoCont) + "\n");
    }

    // Método para fechar o Scanner
    public void fecharScanner() {
        if (sc != null) {
            sc.close();
        }
    }
}
