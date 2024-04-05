package Ospedale;

import java.io.*;
import java.util.*;

public class ProntoSoccorso{

    Lista<Pazienti> ps;

    public ProntoSoccorso() {
        ps = new Lista<>();
        loadFromFile();
    }

    private void loadFromFile(){
        ps.addTail(new Pazienti("Mario","Rossi","Bianco"));
        ps.addTail(new Pazienti("Giada","Rossi","Rosso"));
        ps.addTail(new Pazienti("Geppetto","Esposito","Verde"));

    }

    @Override
    public String toString() {
        return "ProntoSoccorso [ps=" + ps + "]";
    }

    

   /* public void aggiungiPaziente(String nome, String cognome, String gradoUrgenza) {
        pazienti.add(nome + "," + gradoUrgenza);
    }

    public rimuoviPaziente(Nodo n, int pos) {
        if(isEmpty()){
            root = n;
            n.setSuccessivo(null);
            return false;
        }else{
            String remove = n.remove(pos);
            return true;
        }
    }*/
}