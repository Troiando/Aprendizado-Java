package Construtores.Encapsular.Exe1;

import java.util.Scanner;

public class Banco {
    private String nomeTitular;
    private double balance;
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

    public double getBalance() {
        return balance;
    }

    // Funções/Metodo

    // Cadastrar conta
    public void cadastrar(int numConta, String nomeTitular, double depositoInicial) {
        this.nomeTitular = nomeTitular;
        this.numConta = numConta;
        this.balance = depositoInicial;
        System.out.println("\nCadastro feito com sucesso\n");
    }

    // Soma de Saldo da conta
    public void somaSaldo(double deposito) {
        balance += deposito;
        System.out.println("\nDeposito feito com Sucesso\n");
    }

    // Saque
    public void saqueSub(double saque) {
        balance -= saque + 5.0;
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
                + "Saldo Total: " + String.format("%.2f", this.balance) + "\n");
    }

    // Método para fechar o Scanner
    public void fecharScanner() {
        if (sc != null) {
            sc.close();
        }
    }
}
