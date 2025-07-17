package smartphones;

import prodotti.Prodotto;

public class Smartphone extends Prodotto {
    private String codiceImei;

    private int memoria;

    /* public Smartphone(int codice, String nome, String marca, double prezzo, double iva, String codiceImei,
            int memoria) {
        super(codice, nome, marca, prezzo, iva);
        this.codiceImei = codiceImei;
        this.memoria = memoria;
    } */

    public Smartphone(String codiceImei, int memoria){
        this.codiceImei = codiceImei;
        this.memoria = memoria;
    }

    public String getCodiceImei() {
        return codiceImei;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setCodiceImei(String codiceImei) {
        this.codiceImei = codiceImei;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
}
