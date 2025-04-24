package Ajedrez.Solucion;

public class Torre extends Pieza{
    public Torre(int posX, int posY, Tablero.ColorPieza colorPieza, char simbolo, Tablero tablero){
        super(posX, posY, colorPieza, simbolo, tablero);
    }

    @Override
    public boolean movimientoValido(Posicion casillero){
        Posicion posOrigen = this.getPosicion();

        Posicion cambioPosicion = new Posicion(casillero.getX() - posOrigen.getX(), casillero.getY() - posOrigen.getY());
        return (cambioPosicion.getY() == 0 || cambioPosicion.getX() == 0) && !hayPiezaEntre(posOrigen, casillero);
    }
}
