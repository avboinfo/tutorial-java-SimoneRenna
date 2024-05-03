package Alberi;
public class Main {

    public static void main(String[] args){
        Nodo radice = new Nodo(10);
        Nodo sx = new Nodo(3);
        Nodo dx = new Nodo(4);

        radice.setFiglio_sx(sx);
        radice.setFiglio_dx(dx);

        System.out.println(radice);
    }
}