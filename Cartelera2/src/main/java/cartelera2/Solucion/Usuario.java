package cartelera2.Solucion;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
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
            mensajeEnviado.imprimirMensaje();
        }
    }

    public void listarMensajesRecibidos(){
        for(Mensaje mensajeRecibido : mensajesRecibidos){
            mensajeRecibido.imprimirMensaje();
        }
    }

    public abstract boolean cerrarSistema();
}
