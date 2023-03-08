public class AT1 {
    public static void main(String[] args) {
    
        class Pessoa {
            String nome;
            int idade;

            Pessoa(String nome, int idade) {
                this.nome = nome;
                this.idade = idade;
            }

            void imprimir() {
                    System.out.println(nome + " tem " + idade + " anos.");    
            }
        }

        // Cria uma instância da classe Pessoa
        Pessoa pessoa1 = new Pessoa("Jandilson", 20);
        Pessoa pessoa2 = new Pessoa( "Alessandra", 21);
        pessoa1.imprimir();
        pessoa2.imprimir();
    }
}