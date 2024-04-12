package Supermercato;


import java.io.*;

public class Spesa {
    private Lista<T> elencoProdotti;

    public Spesa() {
        elencoProdotti = new Lista();
        Spesa spesa = new Spesa();
        spesa.aggiungiProdotto("codice1");
        spesa.aggiungiProdotto("codice2");
        spesa.aggiungiProdotto("codice3");

        spesa.stampaElenco();
        System.out.println("Costo totale: " + spesa.calcolaCostoTotale());

        spesa.salvaSuFile("Supermercato/spesa.txt");
    }

    public double calcolaCostoTotale() {
        double costoTotale = 0;
        Nodo<T> da = elencoProdotti.getTesta();
        while (da != null) {
            costoTotale += calcolaCostoProdotto(da.getValore());
            da = da.getNext();
        }
        return costoTotale;
    }



    private double calcolaCostoProdotto(String codiceProdotto) {

        return 0.0;
    }

    
}