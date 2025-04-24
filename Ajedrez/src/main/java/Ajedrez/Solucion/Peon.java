package Ajedrez.Solucion;

public class Peon extends Pieza{

    public Peon(int posX, int posY, Tablero.ColorPieza colorPieza, char simbolo, Tablero tablero){
        super(posX, posY, colorPieza, simbolo, tablero);
    }

    @Override
    public boolean movimientoValido(Posicion casillero){
        Posicion posOrigen = this.getPosicion();
        int posOrigenY = posOrigen.getY();

        Posicion cambioPosicion = new Posicion(casillero.getX()  - posOrigen.getX(), casillero.getY() - posOrigenY);
        if(cambioPosicion.getX() != 0)
            return false;

        int cambioPosicionY = cambioPosicion.getY();
        Tablero.ColorPieza color = this.getColor();

        if(hayPiezaEntre(posOrigen, casillero))
            return false;

        if((posOrigenY == 1 && color == Tablero.ColorPieza.NEGRO) || (posOrigenY == 6 &&  color == Tablero.ColorPieza.BLANCO))
            return Math.abs(cambioPosicionY) == 2 || Math.abs(cambioPosicionY) == 1;
        return Math.abs(cambioPosicionY) == 1;
    }
}