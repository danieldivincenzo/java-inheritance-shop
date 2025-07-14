import cuffie.Cuffia;
import prodotti.Prodotto;
import smartphones.Smartphone;
import televisori.Televisore;

public class App {
    public static void main(String[] args) {
        
        Prodotto p1 = new Prodotto(123, "Wash Master", "Whirpoool", 399.99, 22);
        Smartphone s1 = new Smartphone(12345, "Iphone 16", "Apple", 1600, 22, "745369109387621", 500);
        Televisore t1 = new Televisore(1234, "Liquid", "Samsung", 499.99, 22, 70, true);
        Cuffia c1 = new Cuffia(12345, "x3", "Beats", 50, 22, "Nero", "Wireless");

        
    
    }
}
