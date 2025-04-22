package Ajedrez.Solucion;

public class Main {
    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        tablero.crearTablero();
        tablero.posicionarPiezas();
        tablero.imprimirTablero();
    }
}