package ClasseeOrientação.Classe;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AT1 {
    public static String nome;
    public static int idade;


        public void Pessoa(String nome, int idade) {
            
            this.nome = nome;
            this.idade = idade;
           
        }

    public static void main(String[] args) {
        
        nome = JOptionPane.showInputDialog("Digite seu nome:");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
    }
}


