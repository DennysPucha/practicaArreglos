package controlador.Listas;
/**
 *
 * @author Dennys
 */
public class NodoLista <E>  { //CASA int float double
    private E dato;
    private NodoLista<E> siguiente;

    public NodoLista (E dato, NodoLista<E> sig) {
        this.dato = dato;
        this.siguiente = sig;
    }

    public NodoLista () {
        this.dato = null;
        this.siguiente = null;
    }

    public E getDato() {
        return this.dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }
    
    public NodoLista<E> getSiguiente() {
        return this.siguiente;
    }

    public void setSiguiente(NodoLista<E> siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "NodoLista{" + "dato=" + dato + ", siguiente=" + siguiente + '}';
    }
    
    

}