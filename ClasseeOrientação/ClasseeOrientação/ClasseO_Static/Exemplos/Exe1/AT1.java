package ClasseO_Static.Exemplos.Exe1;

import java.util.Scanner;

public class AT1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double price,cota;
    
        System.out.print("Cotação do dolar ");
        cota = sc.nextDouble();

        System.out.println("Quantidade de dolar ");
        price = sc.nextDouble();

        System.out.println(Cotacao.CurrencyConverter(price,cota));

    }
}
