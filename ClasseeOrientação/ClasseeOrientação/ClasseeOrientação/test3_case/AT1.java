package ClasseeOrientação.test3_case;

import java.util.Locale;
import java.util.Scanner;

public class AT1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int home;
        Produto produto = new Produto();

        System.out.println("==Digite==");
        System.out.print("\n1 - Registrar Produto");
        System.out.print("\n2 - Enter the number of products to be added in stock");
        System.out.print("\n3 - Enter the number of products to be removed in stock");
        System.out.println();
        home = sc.nextInt();

        switch (home) {
            
            case 1:

                System.out.println("Name: ");
                produto.name = sc.next();
                System.out.println("Price: ");
                produto.price = sc.nextDouble();
                System.out.println("QTD: ");
                produto.qtd = sc.nextInt();

                System.out.println();
                System.out.println("Product data: " + produto);

               break;
            case 2:

                System.out.println();
                System.out.print("Enter the number of products to be added in stock: ");
                int quantity = sc.nextInt();
                produto.addProducts(quantity);

                System.out.println();
                System.out.println("Update data: " + produto);

                break;
            case 3:
                System.out.println();
                System.out.print("Enter the number of products to be removed in stock: ");
                quantity = sc.nextInt();
                produto.removeProducts(quantity);

                System.out.println();
                System.out.println("Product data: " + produto);
                break;
            default:
                break;
        }

        sc.close();

    }
}