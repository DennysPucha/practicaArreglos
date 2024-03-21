package controlador.listas.pilas;


import controlador.Listas.ListaEnlazada;
import controlador.Listas.exceptions.ListaNullaException;
import controlador.Listas.exceptions.PosicionNoEncontradaException;
import controlador.listas.pilas.Exceptions.PilaLlenaException;
import controlador.listas.pilas.Exceptions.PilaVaciaException;

public class Pila<E> extends ListaEnlazada<E>{
    private Integer tope;

    public Pila(Integer tope) {
        this.tope = tope;
    }
    
    public Boolean estaLlena(){
        return tope == getSize(); 
    }
    
    public void push(E dato) throws PilaLlenaException{
        if(!estaLlena()){
            insertarCabecera(dato);
        }else{
            throw new PilaLlenaException();
        }
    }
    
    public E pop () throws PilaVaciaException, ListaNullaException, PosicionNoEncontradaException{
        if(!estaVacia()){
            E dato = eliminar(0);
            
            return dato;
        }else{
            throw new PilaVaciaException();
        }
    }
    
}
