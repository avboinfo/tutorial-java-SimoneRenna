package E_Esercizi;

public class Main {

    public static void main( String[] args ) {
        Pila<String> s = new Pila<>();
        s.push("Pino");
        s.push("Geppetto"); 
        s.push("Pierino");
        s.push("Marco");
        System.out.println(s.pop());
        System.out.println(s);
    }

}