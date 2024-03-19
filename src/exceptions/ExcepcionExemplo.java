package exceptions;

public class ExcepcionExemplo extends Exception {
    public ExcepcionExemplo(String msg) {
        super(msg);
    }

    public ExcepcionExemplo() {
        super("Excepcion de ejemplo");
    }

}
