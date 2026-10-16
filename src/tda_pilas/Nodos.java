
package tda_pilas;


public class Nodos<T>{
    T dato;
    Nodos<T> siguiente;
    
    public Nodos(T dato){
        this.dato = dato;
        this.siguiente = null ;
    }
}
