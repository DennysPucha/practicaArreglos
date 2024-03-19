package controlador.Listas.exceptions;

public class ListaNullaException extends Exception {
    public ListaNullaException(String msg) {
        super(msg);
    }

    public ListaNullaException() {
        super("No se puede operar, lista vacia");
    }

}
