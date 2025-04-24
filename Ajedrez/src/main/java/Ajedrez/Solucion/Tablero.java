package Ajedrez.Solucion;

import java.util.List;
import java.util.ArrayList;

public class Tablero {
    private final char[][] tablero;
    private final List<Pieza> piezas;
    public enum ColorPieza{BLANCO, NEGRO}
    private final List<Pieza> piezasComidas;

    public Tablero(){
        tablero = new char[8][8];
        piezas = new ArrayList<>();
        piezasComidas = new ArrayList<>();
    }

    public void crearTablero(){
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[i].length; j++)
                tablero[i][j] = (i + j) % 2 == 0 ? ' ' : '.';
        }
        posicionarPiezas();
        imprimirTablero();
    }

    public Pieza getPiezaConPosicion(Posicion posicionBuscada){
        for(Pieza pieza : piezas){
            Posicion posicionPieza = pieza.getPosicion();
            if(posicionPieza.getX() == posicionBuscada.getX() && posicionPieza.getY() == posicionBuscada.getY())
                return pieza;
        }
        return null;
    }

    public void posicionarPiezas(){
        for(int i = 0; i < 8; i++){
            piezas.add(new Peon(i, 1, ColorPieza.NEGRO, 'p', this));
            piezas.add(new Peon(i, 6, ColorPieza.BLANCO, 'P', this));
        }
        piezas.add(new Torre(0, 0, ColorPieza.NEGRO, 't', this));
        piezas.add(new Caballo(1, 0, ColorPieza.NEGRO, 'c', this));
        piezas.add(new Alfil(2, 0, ColorPieza.NEGRO, 'a', this));
        piezas.add(new Rey(3, 0, ColorPieza.NEGRO, 'r', this));
        piezas.add(new Dama(4, 0, ColorPieza.NEGRO, 'd', this));
        piezas.add(new Alfil(5, 0, ColorPieza.NEGRO, 'a', this));
        piezas.add(new Caballo(6, 0, ColorPieza.NEGRO, 'c', this));
        piezas.add(new Torre(7, 0, ColorPieza.NEGRO, 't', this));
        piezas.add(new Torre(0, 7, ColorPieza.BLANCO, 'T', this));
        piezas.add(new Caballo(1, 7, ColorPieza.BLANCO, 'C', this));
        piezas.add(new Alfil(2, 7, ColorPieza.BLANCO, 'A', this));
        piezas.add(new Rey(3, 7, ColorPieza.BLANCO, 'R', this));
        piezas.add(new Dama(4, 7, ColorPieza.BLANCO, 'D', this));
        piezas.add(new Alfil(5, 7, ColorPieza.BLANCO, 'A', this));
        piezas.add(new Caballo(6, 7, ColorPieza.BLANCO, 'C', this));
        piezas.add(new Torre(7, 7, ColorPieza.BLANCO, 'T', this));


        for(Pieza pieza : piezas){
            int x = pieza.getPosicion().getX();
            int y = pieza.getPosicion().getY();
            tablero[y][x] = pieza.getSimbolo();
        }
    }

    public char[][] getTablero(){
        return tablero;
    }

    public void imprimirTablero(){
        for (char[] fila : tablero) {
            for (char element : fila) System.out.print(element);
            System.out.println();
        }
    }

    public void listarPiezasComidas(){
        System.out.println("Piezas comidas:");
        for(Pieza piezaComida : piezasComidas)
            System.out.println(piezaComida.getSimbolo());
    }

    public void moverPieza(Pieza piezaAMover, Posicion casillero){
        Posicion posicionOrigen = piezaAMover.getPosicion();
        int posicionPiezaX = posicionOrigen.getX();
        int posicionPiezaY = posicionOrigen.getY();

        for(Pieza pieza : piezas){
            if(pieza.getPosicion().getX() == casillero.getX() && pieza.getPosicion().getY() == casillero.getY()){
                if(pieza.getColor() != piezaAMover.getColor() && piezaAMover.moverPieza(casillero)){
                    Posicion posicionPieza = piezaAMover.getPosicion();
                    tablero[posicionPieza.getY()][posicionPieza.getX()] = piezaAMover.getSimbolo();
                    tablero[posicionPiezaY][posicionPiezaX] = (posicionPiezaX + posicionPiezaY) % 2 == 0 ? ' ' : '.';
                    piezas.remove(pieza);
                    piezasComidas.add(pieza);
                    imprimirTablero();
                    listarPiezasComidas();
                    return;
                }
                System.out.println("Movimiento inválido");
                return;
            }
        }
        if(piezaAMover.moverPieza(casillero)){
            Posicion posicionPieza = piezaAMover.getPosicion();
            tablero[posicionPieza.getY()][posicionPieza.getX()] = piezaAMover.getSimbolo();
            tablero[posicionPiezaY][posicionPiezaX] = (posicionPiezaX + posicionPiezaY) % 2 == 0 ? ' ' : '.';
            imprimirTablero();
            return;
        }
        System.out.println("Movimiento inválido");
    }
}