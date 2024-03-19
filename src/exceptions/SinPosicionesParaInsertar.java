package exceptions;

public class SinPosicionesParaInsertar extends Exception {
    public SinPosicionesParaInsertar(String msg) {
        super(msg);
    }

    public SinPosicionesParaInsertar() {
        super("No quedan posiciones libres para insertar en el arreglo");
    }

}
