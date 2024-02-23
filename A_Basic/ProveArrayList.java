import java.util.ArrayList;
//import java.util.Collections;

public class ProveArrayList {
    public static void main(String[] args){
        System.out.println("Ciao");
        ArrayList<String> caserta = new ArrayList();
        caserta.add("Uno");
        caserta.add("Babina");
        caserta.add("Tre");
        caserta.add("Quattro");
        caserta.add("Cinque");
        caserta.remove(1);
        caserta.add(1,"Due");
        //Collections.sort(caserta);
        for(String s : caserta){
            System.out.println(s);
        }

        for(int i=0;i<caserta.size();i++){ //entrambi i for fanno le stesse cose
            String s=caserta.get(i);
            System.out.println(s);
        }
        System.out.println(caserta);
        System.out.println("Ancona".compareTo("Bologna"));
        
    }
}
