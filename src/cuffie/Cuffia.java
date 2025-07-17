package cuffie;

import prodotti.Prodotto;

public class Cuffia extends Prodotto {
    private String colore;

    private String tipoConnessione;


    /* public Cuffia(int codice, String nome, String marca, double prezzo, double iva, String colore,
            String tipoConnessione) {
        super(codice, nome, marca, prezzo, iva);
        this.colore = colore;
        this.tipoConnessione = tipoConnessione;
    } */

    public Cuffia(String colore, String tipoConnessione){
        this.colore = colore;
        this.tipoConnessione = tipoConnessione;
    }

   public String getColore() {
       return colore;
   }

   public String getTipoConnessione() {
       return tipoConnessione;
   }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public void setTipoConnessione(String tipoConnessione) {
        this.tipoConnessione = tipoConnessione;
    }

    @Override
    public String toString(){
        return "Codice: " + getCodice() + ", nome: " + getNome() + ", marca: " + getMarca() + ", prezzo: " + getPrezzo() + ", iva: " + getIva() + ", colore: " + colore + ", tipo di connessione: " + tipoConnessione;
    }
}
