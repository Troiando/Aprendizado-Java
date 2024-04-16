package Construtores.Exe.Exe1;

import java.util.Scanner;

// Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
// titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
// inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
// conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.

public class AT1 {

    public static void main(String[] args) {
        Banco banco = new Banco();
        String nomeTitular ;
        double depositoInicial;
        int numConta;
        Scanner sc = new Scanner(System.in);

            System.out.print("Nome Completo: ");
            nomeTitular = sc.nextLine();

            System.out.println("Numero da conta: ");
            numConta = sc.nextInt();
            
            System.out.print("Fazer deposito inicial? S/N ");
            String resp = sc.nextLine();

            //Verificar S/N
            if (banco.verificarResp(resp)==true){
                depositoInicial = sc.nextDouble();
                banco.saldoTotal(depositoInicial);
                banco.cadastrar(nomeTitular, numConta, depositoInicial);
            }else {
                banco.cadastrar(nomeTitular, numConta, depositoInicial=0);
            }

            System.out.println(banco.test());
            System.out.println(banco.test2());
        
        sc.close();
    }

}
