package L_Lista;

public class Main {

    public static void main(String[] args){
        System.out.println("Partiti!");
        Lista l = new Lista();
        System.out.println(l);
        for(int i=0;i<10;i++){
            l.add(new Nodo(100,null));
        }
        System.out.println(l);
        
        Nodo n = new Nodo(100, null);
        System.out.println(n);
    }
    
}
