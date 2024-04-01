package ClasseeOrientação.test3;

import java.util.Locale;
import java.util.Scanner;

public class AT1 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();
        System.out.println("Enter product");
        System.out.print("Name: ");
        produto.name = sc.nextLine();
        System.out.print("Price: ");
        produto.price = sc.nextDouble();
        System.out.print("QTD: ");
        produto.qtd = sc.nextInt();

        System.out.println();
        System.out.println("Product data: " + produto);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        produto.addProducts(quantity);

        System.out.println();
        System.out.println("Update data: "+ produto);

        System.out.println();
        System.out.print("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        produto.removeProducts(quantity);

        System.out.println();
        System.out.println("Product data: " + produto);

        sc.close();

    }
}