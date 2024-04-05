package Ospedale;
    
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

        /*public void addSorted(T v){
            Nodo<T> n = new Nodo<>(v);
            if(isEmpty()){root=n; return;}
            int vn = n.getValore();
            if(vn<root.getValore()){n.getSuccessivo(root); root=n; return;}
            Nodo p1 = root;
            Nodo p2 = root.getSuccessivo();
            while(p2!=null && vn>p2.getValore()){
                p1=p2;
                p2=p1.getSuccessivo();
            }
            n.setSuccessivo(p2);
            p1.setSuccessivo(n);
        }*/




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
    
            s += "The end of the list********\n";
            return s;
    }

    public boolean isEmpty(){
        return root==null;
    }


}
