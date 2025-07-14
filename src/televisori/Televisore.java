package televisori;

import prodotti.Prodotto;

public class Televisore extends Prodotto {
    private int dimensioniInPollici;

    private boolean smart;


    public Televisore(int codice, String nome, String marca, double prezzo, double iva, int dimensioni,
            boolean smart) {
        super(codice, nome, marca, prezzo, iva);
        this.dimensioniInPollici = dimensioni;
        this.smart = smart;
    }

    public void setDimensioni(int dimensioni) {
        this.dimensioniInPollici = dimensioni;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }
}
