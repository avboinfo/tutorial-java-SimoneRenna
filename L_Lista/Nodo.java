package L_Lista;

import java.io.*;

public class Nodo{
    private int valore;
    private Nodo successivo;
    
    public Nodo(int valore, Nodo successivo){
        this.valore = valore;
        successivo = null;
    }

    public void setSuccessivo(Nodo n){
        successivo = n;
    }

    public int getValore(){
        return valore;
    }

    public Nodo getSuccessivo(){
        return successivo;
    }

    public String toString(){
        return "Io sono bello figo gu" + valore + "\n";
    }

}