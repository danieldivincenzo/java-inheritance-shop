package televisori;

import prodotti.Prodotto;

public class Televisore extends Prodotto {
    private int dimensioniInPollici;

    private boolean smart;


    /* public Televisore(int codice, String nome, String marca, double prezzo, double iva, int dimensioni,
            boolean smart) {
        super(codice, nome, marca, prezzo, iva);
        this.dimensioniInPollici = dimensioni;
        this.smart = smart;
    } */

    public Televisore(int dimensioniInPollici, boolean smart){
        this.dimensioniInPollici = dimensioniInPollici;
        this.smart = smart;
    }
   
   public int getDimensioniInPollici() {
       return dimensioniInPollici;
   }

   public boolean getSmart() {
       return smart;
   }

    public void setDimensioni(int dimensioni) {
        this.dimensioniInPollici = dimensioni;
    }


    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    @Override
    public String toString(){
        return "Codice: " + getCodice() + ", nome: " + getNome() + ", marca: " + getMarca() + ", prezzo: " + getPrezzo() + ", iva: " + getIva() + ", dimensione (in pollici): " + dimensioniInPollici + ", è smart? " + smart;
    }
}
