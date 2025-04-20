package cartelera2.Solucion;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private final String nombreUsuario;
    private final String contrasenia;
    private final List<Mensaje> mensajesRecibidos;
    private final List<Mensaje> mensajesEnviados;

    public Usuario(String nombreUsuario, String contrasenia){
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        mensajesEnviados = new ArrayList<>();
        mensajesRecibidos = new ArrayList<>();
    }

    public String getNombreUsuario(){
        return nombreUsuario;
    }

    public String getContrasenia(){
        return contrasenia;
    }

    public void recibirMensaje(Mensaje mensaje){
        mensajesRecibidos.addFirst(mensaje);
    }

    public void enviarMensaje(Mensaje mensaje){
        mensajesEnviados.addFirst(mensaje);
    }

    public void listarMensajesEnviados(){
        for(Mensaje mensajeEnviado : mensajesEnviados){
            if(mensajeEnviado instanceof TextoSimple)
                System.out.println(mensajeEnviado.getMensaje());
            else {
                Link link = (Link)mensajeEnviado;
                System.out.println(link.getLink());
            }
        }
    }

    public void listarMensajesRecibidos(){
        for(Mensaje mensajeRecibido : mensajesRecibidos){
            if(mensajeRecibido instanceof TextoSimple)
                System.out.println(mensajeRecibido.getMensaje());
            else {
                Link link = (Link)mensajeRecibido;
                System.out.println(link.getLink());
            }
        }
    }
}
