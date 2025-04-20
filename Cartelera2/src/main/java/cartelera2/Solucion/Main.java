package cartelera2.Solucion;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws MalformedURLException, URISyntaxException {
        Personal usuario1 = new Personal("pepe123", "aguantehuracan");
        Huesped usuario2 = new Huesped("juanceto01", "baneado");
        Huesped usuario3 = new Huesped("Tito", "Calderón");

        Cartelera cartelera = new Cartelera();

        Mensaje mensaje1 = new TextoSimple("Me llama");
        Mensaje link1 = new Link("https://en.wikipedia.org");

        cartelera.registrarUsuario(usuario1);
        cartelera.registrarUsuario(usuario2);
        cartelera.registrarUsuario(usuario3);
        if(!cartelera.autenticarUsuario(usuario1.getNombreUsuario(), usuario1.getContrasenia()))
            System.out.println("Error al autenticar a" + usuario1.getNombreUsuario());

        boolean mensajeEnviado1 = cartelera.enviarMensaje(usuario2, mensaje1);
        boolean mensajeEnviado2 = cartelera.enviarMensaje(usuario3, link1);
        if(!mensajeEnviado2 || !mensajeEnviado1)
            System.out.println("Alguno de los destinatarios no estaba registrado en el sistema");

        Usuario usuario4 = usuario1.crearUsuario(false, "HolaDonPepito", "HolaDonJose");

        System.out.println("Mensajes enviados por " + usuario1.getNombreUsuario() + ":");
        cartelera.listarMensajesEnviados();

        if(!cartelera.autenticarUsuario(usuario2.getNombreUsuario(), usuario2.getContrasenia()))
            System.out.println("Error al autenticar a" + usuario2.getNombreUsuario());
        System.out.println("Mensajes recibidos por " + usuario2.getNombreUsuario() + ":");
        cartelera.listarMensajesRecibidos();

        if(!cartelera.autenticarUsuario(usuario3.getNombreUsuario(), usuario3.getContrasenia()))
            System.out.println("Error al autenticar a" + usuario3.getNombreUsuario());
        System.out.println("Mensajes recibidos por " + usuario3.getNombreUsuario() + ":");
        cartelera.listarMensajesRecibidos();

        if(!cartelera.autenticarUsuario(usuario4.getNombreUsuario(), usuario4.getContrasenia()))
            System.out.println("Error al autenticar a " + usuario4.getNombreUsuario());

        cartelera.cerrarSesion();

        if(!cartelera.autenticarUsuario(usuario1.getNombreUsuario(), usuario1.getContrasenia()))
            System.out.println("Error al autenticar a" + usuario1.getNombreUsuario());

        cartelera.cerrarSistema();
    }
}