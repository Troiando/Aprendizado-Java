package ClasseeOrientação.test3_case;

public class Produto {

    public String name;
    public double price;
    public int qtd;


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
            + ", " + qtd 
            + ",  Total: $ " + String.format("%.2f", totalValueInStock());
        }
}
