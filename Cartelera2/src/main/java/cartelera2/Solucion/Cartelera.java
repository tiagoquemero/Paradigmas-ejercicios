package cartelera2.Solucion;

import java.util.List;
import java.util.ArrayList;

public class Cartelera {
    protected static Usuario usuarioActual;
    protected static List<Usuario> usuarioRegistrados;

    public Cartelera(){
        usuarioRegistrados = new ArrayList<>();
    }

    public void registrarUsuario(Usuario usuario){
        usuarioRegistrados.add(usuario);
    }

    public boolean autenticarUsuario(String nombreUsuario, String contrasenia){
        for(Usuario usuarioRegistrado : usuarioRegistrados){
            if(usuarioRegistrado.getNombreUsuario().equals(nombreUsuario) && usuarioRegistrado.getContrasenia().equals(contrasenia)) {
                usuarioActual = usuarioRegistrado;
                return true;
            }
        }
        return false;
    }

    public boolean enviarMensaje(Usuario destinatario, Mensaje mensaje){
        if(!usuarioRegistrados.contains(destinatario))
            return false;
        usuarioActual.enviarMensaje(mensaje);
        destinatario.recibirMensaje(mensaje);
        return true;
    }

    public void listarMensajesEnviados(){
        usuarioActual.listarMensajesEnviados();
    }

    public void listarMensajesRecibidos(){
        usuarioActual.listarMensajesRecibidos();
    }

    public void cerrarSesion(){
        System.out.println("La sesión de " + usuarioActual.getNombreUsuario() + " está siendo cerrada");
        usuarioActual = null;
    }

    public boolean cerrarSistema(){
        return usuarioActual.cerrarSistema();
    }
}
