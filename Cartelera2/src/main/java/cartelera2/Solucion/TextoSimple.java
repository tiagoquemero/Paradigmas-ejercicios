package cartelera2.Solucion;

public class TextoSimple extends Mensaje{
    private final String mensaje;

    public TextoSimple(String mensaje){
        super(mensaje);
        this.mensaje = mensaje;
    }

    @Override
    public void imprimirMensaje(){
        System.out.println(mensaje);
    }
}
