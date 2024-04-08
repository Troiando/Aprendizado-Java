package Construtores.test1;

public class Produto {

    public String name;
    public double price;
    public int qtd;

    public Produto(String name, double price, int qtd){
        this.name = name;
        this.price = price;
        this.qtd = qtd;
    }

     public double totalValueInStock() {
                return price*qtd; 
    }

        public void addProducts(int quantity ) {
            this.qtd += quantity;
        }
  
        public void removeProducts(int quantity ) {
            this.qtd -= quantity;
        }

        public String toString(){
            return name 
            + ", $ " + String.format("%.2f", price) 
            + ", Quantidade: " + qtd 
            + ",  Total: $ " + String.format("%.2f", totalValueInStock());
        }
}
