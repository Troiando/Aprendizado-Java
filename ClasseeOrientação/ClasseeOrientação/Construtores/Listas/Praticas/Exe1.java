package Construtores.Listas.Praticas;

import java.util.*;

public class Exe1 {
    public static void main(String[] args) {

        List<Modulo_Exe1> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade do registro? ");
        int qtd = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtd; i++) {
            System.out.println("Registro " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            double salary = sc.nextDouble();
            sc.nextLine();
            System.out.println();

            Modulo_Exe1 modulo = new Modulo_Exe1(id, nome, salary);
            list.add(modulo);
        }

        // Validação ID
        System.out.println("Digite o ID para buscar o registro e aumentar salário:");
        int searchId = sc.nextInt();

        Modulo_Exe1 foundModulo = findById(list, searchId);
        if (foundModulo != null) {
            System.out.println("Digite a porcentagem para aumentar o salário:");
            double percentage = sc.nextDouble();
            foundModulo.porcentagem(percentage);
            System.out.println("Salário atualizado: " + foundModulo);
        } else {
            System.out.println("Registro com ID " + searchId + " não encontrado.");
        }

        System.out.println("Registros : ");
        for (Modulo_Exe1 modulo : list) {
            System.out.println(modulo);
        }
    }

    public static Modulo_Exe1 findById(List<Modulo_Exe1> list, int id) {
        for (Modulo_Exe1 modulo : list) {
            if (modulo.getId() == id) {
                return modulo;
            }
        }
        return null;
    }
}
