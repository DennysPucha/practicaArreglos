package exceptions;

public class PosicionFueraDeLimites extends Exception {
    public PosicionFueraDeLimites(String msg) {
        super(msg);
    }

    public PosicionFueraDeLimites() {
        super("Posicion indefinida");
    }

}
