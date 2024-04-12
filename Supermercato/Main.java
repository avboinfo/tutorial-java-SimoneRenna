package Supermercato;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
    String codice;
    String descrizione;
    double costo;
    Prodotti prodotti = new Prodotti(codice, descrizione, costo);
    Lista<Prodotti> listaProdotti = prodotti.getlistaProdotti();

    for (Prodotti p : listaProdotti) {
        System.out.println(p);
    }
    
}
}

