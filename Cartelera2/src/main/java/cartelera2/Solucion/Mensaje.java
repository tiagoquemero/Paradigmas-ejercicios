package cartelera2.Solucion;

public abstract class Mensaje {
    private final String mensaje;

    public Mensaje(String mensaje){
        this.mensaje = mensaje;
    }

    public abstract void imprimirMensaje();
}
