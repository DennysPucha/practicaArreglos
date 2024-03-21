package controlador.listas.colas;


import controlador.Listas.ListaEnlazada;
import controlador.Listas.NodoLista;
import controlador.Listas.exceptions.ListaNullaException;
import controlador.Listas.exceptions.PosicionNoEncontradaException;
import controlador.listas.colas.Exceptions.ColaLlenaException;
import controlador.listas.colas.Exceptions.ColaVaciaException;

public class Cola<E> extends ListaEnlazada<E> {

    private Integer cima;

    public Cola(Integer cima) {
        this.cima = cima;
    }

    public Boolean estaLlena() {
        return cima == getSize();
    }

    public void queue(E dato) throws ColaLlenaException, PosicionNoEncontradaException {
        if (!estaLlena()) {
            //insertarPosicion(dato, getTamanio());
            this.insertar(dato);
        } else {
            throw new ColaLlenaException();
        }
    }

    public E dequeue() throws ColaVaciaException, ListaNullaException, PosicionNoEncontradaException {
        if (!estaVacia()) {
            E dato = this.eliminar(0);
            return dato;
        } else {
            throw new ColaVaciaException();
        }
    }


}
