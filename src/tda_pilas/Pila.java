package tda_pilas;

public class Pila<T>{
    
    private Nodos<T> tope;
    
    public Pila(){
        this.tope = null;
    }
    
    public boolean vacia(){
        return this.tope == null;
    }
    
    public void empuja(T dato){
        Nodos<T> nuevoNodo = new Nodos<>(dato);
        nuevoNodo.siguiente = this.tope;
        this.tope = nuevoNodo;
    }
    
    public T pop(){
        if (vacia()){
            System.out.println("La pila esta vacia wey, no puedes extraer nada");
            return null;
        }
        
        T datoExtraido = this.tope.dato;
        this.tope = this.tope.siguiente;
        return datoExtraido;
        
    }
    
    public T peek(){
        if(vacia()){
            System.out.println("LA pila esta vaciaaaaaa");
            return null;
        }
        
        return this.tope.dato;
    }
}
