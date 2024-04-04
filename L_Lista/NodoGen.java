package L_Lista;

public class NodoGen<T>{
    private T valore;
    private NodoGen<T> successivo;
    

    public NodoGen(T valore){
        this.valore = valore;
        successivo = null;
        
    }

    public String toString(){
        return "Il mio valore è: " + valore;
    }

    public void setValore(T valore){
        this.valore = valore;


    }

    public T getValore(){
        return valore;
    }
}