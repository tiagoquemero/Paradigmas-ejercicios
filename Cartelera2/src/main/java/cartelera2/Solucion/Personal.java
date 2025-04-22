package cartelera2.Solucion;

public class Personal extends Usuario {
    public Personal(String nombreUsuario, String contrasenia) {
        super(nombreUsuario, contrasenia);
    }

    public Usuario crearUsuario(boolean huesped, String nombreUsuario, String contrasenia) {
        if (huesped)
            return new Huesped(nombreUsuario, contrasenia);
        return new Personal(nombreUsuario, contrasenia);
    }

    @Override
    public boolean cerrarSistema(){
        System.out.println("El sistema está siendo cerrado por " + getNombreUsuario());
        Cartelera.usuarioRegistrados.clear();
        Cartelera.usuarioActual = null;
        return true;
    }
}
