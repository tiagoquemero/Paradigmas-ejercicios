package Ajedrez.Solucion;

public class Dama extends Pieza{

    public Dama(int posX, int posY, Tablero.ColorPieza colorPieza, char simbolo, Tablero tablero){
        super(posX, posY, colorPieza, simbolo, tablero);
    }

    @Override
    public boolean movimientoValido(Posicion casillero){
        Posicion posicionOrigen = this.getPosicion();

        Posicion cambioPosicion = new Posicion(casillero.getX()  - posicionOrigen.getX(), casillero.getY() - posicionOrigen.getY());
        return (Math.abs(cambioPosicion.getX()) == Math.abs(cambioPosicion.getY())) && (cambioPosicion.getY() == 0 || cambioPosicion.getX() == 0) && (!hayPiezaEntre(posicionOrigen, casillero));
    }
}