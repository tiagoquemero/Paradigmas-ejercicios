package Ajedrez.Solucion;

public class Main {
    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        tablero.crearTablero();

        Pieza peon1 = tablero.getPiezaConPosicion(new Posicion(0, 1));
        Pieza caballo1 = tablero.getPiezaConPosicion(new Posicion(1, 7));
        Pieza peon2 = tablero.getPiezaConPosicion(new Posicion(1, 1));
        Pieza torre1 = tablero.getPiezaConPosicion(new Posicion(7, 0));
        Pieza peon3 = tablero.getPiezaConPosicion(new Posicion(1, 6));

        tablero.moverPieza(peon1, new Posicion(0, 2));
        tablero.moverPieza(caballo1, new Posicion(0, 5));
        tablero.moverPieza(peon1, new Posicion(4, 1));
        tablero.moverPieza(peon2, new Posicion(1, 3));
        tablero.moverPieza(torre1, new Posicion(7, 5));
        tablero.moverPieza(caballo1, new Posicion(1, 3));
        tablero.moverPieza(peon3, new Posicion(1, 5));
    }
}