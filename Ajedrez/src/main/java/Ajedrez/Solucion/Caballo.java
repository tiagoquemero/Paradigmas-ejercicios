package Ajedrez.Solucion;

public class Caballo extends Pieza{
    public Caballo(int posX, int posY, Tablero.ColorPieza colorPieza, char simbolo, Tablero tablero){
        super(posX, posY, colorPieza, simbolo, tablero);
    }

    @Override
    public boolean movimientoValido(Posicion casillero){
        Posicion cambioPosicion = new Posicion(casillero.getX()  - this.getPosicion().getX(), casillero.getY() - this.getPosicion().getY());
        int cambioX = cambioPosicion.getX();
        int cambioY = cambioPosicion.getY();
        return (Math.abs(cambioX) == 1 && Math.abs(cambioY) == 2) || (Math.abs(cambioX) == 2 && Math.abs(cambioY) == 1);
    }
}
