package carrello;

import cuffie.Cuffia;
import java.util.Scanner;
import prodotti.Prodotto;
import smartphones.Smartphone;
import televisori.Televisore;

public class carrello {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(
                "Quale prodotto vuoi aggiungere al carrello? Scegli 1 per Smartphone, 2 per Televisore, 3 per Cuffie o 4 per un prodotto generico: ");
        int numeroProdotto = scan.nextInt();
        Prodotto p1 = null;

        if (numeroProdotto == 1) {
            System.out.println("Hai scelto uno Smartphone, ora dai un valore alle sue caratteristiche.");
            scan.nextLine();

            System.out.println("Inserisci il suo codice IMEI: ");
            String codiceImeiS = scan.nextLine();

            System.out.println("Inserisci la sua memoria (in Gb): ");
            int memoriaS = scan.nextInt();

            p1 = new Smartphone(codiceImeiS, memoriaS);

            System.out.println("Inserisci il codice: ");
            int codiceS = scan.nextInt();
            p1.setCodice(codiceS);
            
            scan.nextLine();
            System.out.println("Inserisci il nome: ");
            String nomeS = scan.nextLine();
            p1.setNome(nomeS);

            System.out.println("Inserisci la marca: ");
            String marcaS = scan.nextLine();
            p1.setMarca(marcaS);

            System.out.println("Inserisci il prezzo: ");
            double prezzoS = scan.nextDouble();
            p1.setPrezzo(prezzoS);

            System.out.println("Inserisci l'iva: ");
            double ivaS = scan.nextDouble();
            p1.setIva(ivaS);

            System.out.println("");

            System.out.println(p1.getCodice());
            System.out.println(p1.getNome());
            System.out.println(p1.getMarca());
            System.out.println(p1.getPrezzo());
            System.out.println(p1.getIva());
            

        }else if (numeroProdotto == 2){

            System.out.println("Hai scelto un Terlevisore, ora dai un valore alle sue caratteristiche.");

            System.out.println("Inserisci la sua dimensione in pollici: ");
            int dimensioniInPolliciT = scan.nextInt();

            System.out.println("È smart o no?");
            boolean smartT = scan.nextBoolean();

            p1 = new Televisore(dimensioniInPolliciT, smartT);

            System.out.println("Inserisci il codice: ");
            int codiceT = scan.nextInt();
            p1.setCodice(codiceT);

            scan.nextLine();
            System.out.println("Inserisci il nome: ");
            String nomeT = scan.nextLine();
            p1.setNome(nomeT);

            System.out.println("Inserisci la marca: ");
            String marcaT = scan.nextLine();
            p1.setMarca(marcaT);

            System.out.println("Inserisci il prezzo: ");
            double prezzoT = scan.nextDouble();
            p1.setPrezzo(prezzoT);

            System.out.println("Inserisci l'iva: ");
            double ivaT = scan.nextDouble();
            p1.setIva(ivaT);


            System.out.println("");

            System.out.println(p1.getCodice());
            System.out.println(p1.getNome());
            System.out.println(p1.getMarca());
            System.out.println(p1.getPrezzo());
            System.out.println(p1.getIva());

        } else if (numeroProdotto == 3){
            System.out.println("Hai scelto una Cuffia, ora dai un valore alle sue caratteristiche.");

            System.out.println("Inserisci il suo colore: ");
            String coloreC = scan.nextLine();

            scan.nextLine();
            System.out.println("Inserisci il tipo di connessione: ");
            String tipoConnessioneC = scan.nextLine();

            p1 = new Cuffia(coloreC, tipoConnessioneC);

            System.out.println("Inserisci il codice: ");
            int codiceT = scan.nextInt();
            p1.setCodice(codiceT);

            System.out.println("Inserisci il nome: ");
            String nomeT = scan.nextLine();
            p1.setNome(nomeT);

            scan.nextLine();
            System.out.println("Inserisci la marca: ");
            String marcaT = scan.nextLine();
            p1.setMarca(marcaT);

            System.out.println("Inserisci il prezzo: ");
            double prezzoT = scan.nextDouble();
            p1.setPrezzo(prezzoT);

            System.out.println("Inserisci l'iva: ");
            double ivaT = scan.nextDouble();
            p1.setIva(ivaT);

            System.out.println("");

            System.out.println(p1.getCodice());
            System.out.println(p1.getNome());
            System.out.println(p1.getMarca());
            System.out.println(p1.getPrezzo());
            System.out.println(p1.getIva());

        } else {

            System.out.println("Hai scelto un prodotto generico, ora dai un valore alle sue caratteristiche.");

            p1 = new Prodotto();

            System.out.println("Inserisci il codice: ");
            int codiceT = scan.nextInt();
            p1.setCodice(codiceT);

            System.out.println("Inserisci il nome: ");
            String nomeT = scan.nextLine();
            p1.setNome(nomeT);

            scan.nextLine();
            System.out.println("Inserisci la marca: ");
            String marcaT = scan.nextLine();
            p1.setMarca(marcaT);

            System.out.println("Inserisci il prezzo: ");
            double prezzoT = scan.nextDouble();
            p1.setPrezzo(prezzoT);

            System.out.println("Inserisci l'iva: ");
            double ivaT = scan.nextDouble();
            p1.setIva(ivaT);

           
            System.out.println(p1.getCodice());
            System.out.println(p1.getNome());
            System.out.println(p1.getMarca());
            System.out.println(p1.getPrezzo());
            System.out.println(p1.getIva());
        }
        
    }
}