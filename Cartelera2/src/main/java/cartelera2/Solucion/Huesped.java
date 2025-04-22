package cartelera2.Solucion;

public class Huesped extends Usuario{
    public Huesped(String nombreUsuario, String contrasenia){
        super(nombreUsuario, contrasenia);
    }

    @Override
    public boolean cerrarSistema(){
        return false;
    }
}
