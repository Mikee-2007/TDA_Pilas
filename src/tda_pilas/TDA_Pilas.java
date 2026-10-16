package tda_pilas;


public class TDA_Pilas {

    
    public static void main(String[] args) {
        
       Pila<Integer> pila = new Pila<>();
        
        System.out.println("La pila esta vacia we?: " + pila.vacia());
        
        System.out.println("-----Apilando elementos-----");
        pila.empuja(10);
        pila.empuja(20);
        pila.empuja(30);
        
        System.out.println("Elementos en el topo: " + pila.peek());
        
        System.out.println("-----Desapilando elementos-----");
        System.out.println("Elemento extraidos: " + pila.pop());
        System.out.println("Nuevo elemento en el topo: " + pila.peek());
        
        System.out.println("Elemento extraido: " + pila.pop());
        System.out.println("Elemento extraido: " + pila.pop());
        
        System.out.println("LA pila esta vacia: " + pila.vacia());
        
        pila.pop();
    }
    
}
