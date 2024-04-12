package Supermercato;

import java.io.*;
import java.util.*;

public class Prodotti{
    private String codice;
    private String descrizione;
    private double costo;
    private Lista<Prodotti> listaProdotti;

    public Prodotti(String codice, String descrizione, double costo){
        this.codice = codice;
        this.descrizione = descrizione;
        this.costo = costo;
        listaProdotti = new ArrayList<>();
        caricaProdottiDaFile("prodotti.csv");
    }

    @Override
    public String toString() {
        return "Prodotto{" + "codice='" + codice + '\'' + ", descrizione='" + descrizione + '\'' + ", costo=" + costo + '}';
    }

    public void caricaProdottiDaFile(String nomeFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(nomeFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] dividi = line.split(",");
                if (dividi.length == 3) {
                    String codice = dividi[0];
                    String descrizione = dividi[1];
                    double costo = Double.parseDouble(dividi[2]);
                    listaProdotti.add(new Prodotti(codice, descrizione, costo));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

       public Lista<Prodotti> getlistaProdotti() {
        return listaProdotti;
    }
  
}



