package Supermercato;

public class Lista<T>{
        Nodo<T> root;

        public Lista(){
            this.root = null;
        }
        public void addTail(T v){
            addTail(new Nodo<T>(v) );
        }
    
        public void addTail(T v){
            Nodo<T> n = new Nodo<>(v);
            if(root==null){
                root = n;
            }else{
                Nodo<T> tmp = root;
                while (tmp.getSuccessivo()!=null) tmp=tmp.getSuccessivo();
                tmp.setSuccessivo(n);
            }
        }


        public void addHead(T v){
            Nodo<T> n = new Nodo<>(v);
            if(isEmpty()) root=n;
            else{
                n.setSuccessivo(root);
                root = n;
            }
        }
    
        public String toString(){
            String s = "La lista contiene i seguenti elementi:\n";
            Nodo<T> tmp = root;
            while (tmp!=null){
                s += tmp + "\n";
                tmp=tmp.getSuccessivo();
            }
    
            s += "Fine della lista.\n";
            return s;
    }

    public boolean isEmpty(){
        return root==null;
    }


}
