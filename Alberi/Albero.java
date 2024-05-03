package Alberi;

import java.util.ArrayList;

public class Albero {

    Nodo radice;
    
    public Albero(Nodo radice){
        this.radice = radice;
    }

    public ArrayList<Nodo> toArrayList(){
        ArrayList<Nodo> lista = new ArrayList<>();
        lista.add(radice);
        int conta = 0;

        while(conta < lista.size()){
            Nodo locale = lista.get(conta);
            if(locale.getFiglio_sx() != null)
                lista.add(locale.getFiglio_sx());
            if(locale.getFiglio_dx() != null)
                lista.add(locale.getFiglio_dx());
            conta = conta + 1;
        }
    }

    public int numeroNodi(){
        return toArrayList().size();
       
    }

    @Override
    public String toString() {
        ArrayList<Nodo> lista = toArrayList();
        int delimitatore = 2;
        int conta = 0;

        String output = "";
        for(Nodo nodo : lista){
            if(delimitatore > conta){
                output = output + " " + nodo;
            } else{
                delimitatore = delimitatore * 2;
                output = output + "\n" + nodo;
            }
            conta++;
        }
        return output;
    }
}
