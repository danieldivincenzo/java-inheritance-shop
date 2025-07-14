package prodotti;

public class Prodotto {
    private int codice;

    private String nome;

    private String marca;

    private double prezzo;

    private double iva;

    public int getCodice(){
        return codice;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    
}
