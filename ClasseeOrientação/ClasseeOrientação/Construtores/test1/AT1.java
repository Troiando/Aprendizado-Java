package Construtores.test1;

import java.util.Locale;
import java.util.Scanner;

public class AT1 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("QTD: ");
        int qtd = sc.nextInt();

        //Nova Adição
        Produto produto = new Produto(name,price,qtd);

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