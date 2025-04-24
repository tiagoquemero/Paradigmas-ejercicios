package Ajedrez.Solucion;

public class Rey extends Pieza{
    public Rey(int posX, int posY, Tablero.ColorPieza colorPieza, char simbolo, Tablero tablero){
        super(posX, posY, colorPieza, simbolo, tablero);
    }

    @Override
    public boolean movimientoValido(Posicion casillero){
        int casilleroX = casillero.getX();
        int casilleroY = casillero.getY();
        char[][] tablaAjedrez = this.tablero.getTablero();
        Posicion cambioPosicion = new Posicion(casilleroX  - this.getPosicion().getX(), casilleroY - this.getPosicion().getY());

        if(tablaAjedrez[casilleroY][casilleroX] == ' ' || tablaAjedrez[casilleroY][casilleroX] == '.')
            return Math.abs(cambioPosicion.getX()) == 1 || Math.abs(cambioPosicion.getY()) == 1;
        return false;
    }
}
