package prodotti;

public class Prodotto {
    private int codice;

    private String nome;

    private String marca;

    private double prezzo;

    private double iva;

    /* costruttore */
    /* public Prodotto(int codice, String nome, String marca, double prezzo, double iva) {
        this.codice = codice;
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    } */

    /* getters */
    public int getCodice(){
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public double getIva() {
        return iva;
    }


    /* setters */
    public void setCodice(int codice) {
        this.codice = codice;
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

    public String toString(){
        return "Codice: " + codice + ", nome: " + nome + ", marca: " + marca + ", prezzo: " + prezzo + ", iva: " + iva;
    }

    
}
