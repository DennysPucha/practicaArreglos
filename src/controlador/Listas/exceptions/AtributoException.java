package controlador.Listas.exceptions;

public class AtributoException extends Exception {
    public AtributoException(String msg) {
        super(msg);
    }

    public AtributoException() {
        super("No se puede encontrar el atributo dado");
    }

}
