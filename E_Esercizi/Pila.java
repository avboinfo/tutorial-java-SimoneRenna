package E_Esercizi;

import java.util.ArrayList;

public class Pila<T>{
    ArrayList<T> lista;

    public Pila(){
        lista = new ArrayList<T>();
    }

    public void push (T newElement){
        lista.add(newElement);
    }

    public T pop(){
        int size = lista.size();
        if (size==0) return null;
        T z = lista.get(size-1);
        lista.remove(size-1);
        return z;
    }

    public String toString(){
        String s = "Contenuto della pila:\n";
        for (int i=0; i<lista.size(); i++) {
            s += lista.get(i) + "\n";
        }
        return s;
    }
}