package Ajedrez.Solucion;

public class Alfil extends Pieza{

    public Alfil(int posX, int posY, Tablero.ColorPieza colorPieza, char simbolo, Tablero tablero){
        super(posX, posY, colorPieza, simbolo, tablero);
    }

    @Override
    public boolean movimientoValido(Posicion casillero){
        Posicion posicionActual = this.getPosicion();

        Posicion cambioPosicion = new Posicion(casillero.getX()  - posicionActual.getX(), casillero.getY() - posicionActual.getY());
        return Math.abs(cambioPosicion.getX()) == Math.abs(cambioPosicion.getY()) && !hayPiezaEntre(posicionActual, casillero);
    }
}
