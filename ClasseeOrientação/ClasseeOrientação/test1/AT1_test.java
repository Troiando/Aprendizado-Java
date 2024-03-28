package ClasseeOrientação.test1;
import java.util.Scanner;

public class AT1_test {
     public static void main(String[] args) {
        //Cria um objeto Scanner para obter entrada a na janela de entrada
        Scanner input = new Scanner(System.in);

        //cria um objeto para atribuir na AT1
        AT1 at1ob = new AT1();

        //exibe o valor inicial do nome (null)
        System.out.printf("Inicio nome", at1ob.getNome());

        //solicita e lê o nome
        System.out.println(" Digite seu nome");

        String oNome = input.nextLine(); //lê uma linha de texto
        at1ob.setNome(oNome);  //insere oNome em at1ob

        System.out.println();  //gera saida de uma linha branco
            at1ob.getNome();
        //exibe o nome armazenado  no objeto at1ob

    }

}
