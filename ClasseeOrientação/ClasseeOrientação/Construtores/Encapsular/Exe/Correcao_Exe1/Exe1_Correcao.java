package Construtores.Encapsular.Exe.Correcao_Exe1;

import java.util.Scanner;

public class Exe1_Correcao {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Accont accont;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Is there an initial deposit (y/n)? ");
        char resp = sc.next().charAt(0);
        if(resp == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            accont = new Accont(number, holder, initialDeposit);
        }
        else{
            accont = new Accont(number, holder);
        }

        System.out.println(accont);

        System.out.println();
        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        accont.deposit(depositValue);
        System.out.println("Update account data: ");
        System.out.println(accont);

        System.out.println();
        System.out.println("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        accont.withdraw(withdrawValue);
        System.out.println("Update account data: ");
        System.out.println(accont);

    }    
}
