package Construtores.Encapsular.Exe1;

import java.util.Scanner;

/*  
    Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
    titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
    inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
    conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
*/

public class AT1 {

    public static void main(String[] args) {
        Banco banco = new Banco();
        int numConta;
        String nomeTitular, resp;
        double depositoInicial,deposito,saque;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome Completo: ");
        nomeTitular = sc.nextLine();

        System.out.print("Numero da conta: ");
        numConta = sc.nextInt();

        System.out.print("Fazer deposito inicial? S/N ");
        resp = sc.nextLine();

        // Verificar S/N
        if (banco.verificarResp(resp) == true) {
            depositoInicial = sc.nextDouble();
            banco.somaSaldo(depositoInicial);
            banco.cadastrar( numConta,nomeTitular, depositoInicial);
        } else {
            banco.cadastrar( numConta, nomeTitular, depositoInicial = 0);
        }

        banco.visualizar(numConta);

        System.out.println("Faça um deposito: ");
        deposito = sc.nextDouble();
        banco.somaSaldo(deposito);
        System.out.println("Saldo Atualizado");
        banco.visualizar(numConta);

        System.out.println("Faça um saque: ");
        saque = sc.nextDouble();
        banco.saqueSub(saque);
        banco.visualizar(numConta);


    }
}
