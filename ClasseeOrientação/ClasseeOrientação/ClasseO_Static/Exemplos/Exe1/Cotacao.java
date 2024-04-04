package ClasseO_Static.Exemplos.Exe1;

public class Cotacao {
    public static double IOF = 0.06;

    public static double CurrencyConverter(double cota,double price){
        return (price*cota) + ((price)*(cota*IOF));
    }
}
