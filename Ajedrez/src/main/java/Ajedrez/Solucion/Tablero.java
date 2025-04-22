package Ajedrez.Solucion;

import java.util.List;
import java.util.ArrayList;

public class Tablero {
    private char[][] tablero;
    private List<Pieza> piezas;
    public enum ColorPieza{BLANCO, NEGRO}

    public void crearTablero(){
        tablero = new char[8][8];
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[i].length; j++){
                if((i + j) % 2 == 0)
                    tablero[i][j] = ' ';
                else
                    tablero[i][j] = '.';
            }
        }
    }

    public void posicionarPiezas(){
        piezas = new ArrayList<>();
        for(int i = 0; i < 8; i++){
            piezas.add(new Peon(i, 1, ColorPieza.NEGRO, 'p'));
            piezas.add(new Peon(i, 6, ColorPieza.BLANCO, 'P'));
        }
        piezas.add(new Torre(0, 0, ColorPieza.NEGRO, 't'));
        piezas.add(new Caballo(1, 0, ColorPieza.NEGRO, 'c'));
        piezas.add(new Alfil(2, 0, ColorPieza.NEGRO, 'a'));
        piezas.add(new Rey(3, 0, ColorPieza.NEGRO, 'r'));
        piezas.add(new Dama(4, 0, ColorPieza.NEGRO, 'd'));
        piezas.add(new Alfil(5, 0, ColorPieza.NEGRO, 'a'));
        piezas.add(new Caballo(6, 0, ColorPieza.NEGRO, 'c'));
        piezas.add(new Torre(7, 0, ColorPieza.NEGRO, 't'));
        piezas.add(new Torre(0, 7, ColorPieza.BLANCO, 'T'));
        piezas.add(new Caballo(1, 7, ColorPieza.BLANCO, 'C'));
        piezas.add(new Alfil(2, 7, ColorPieza.BLANCO, 'A'));
        piezas.add(new Rey(3, 7, ColorPieza.BLANCO, 'R'));
        piezas.add(new Dama(4, 7, ColorPieza.BLANCO, 'D'));
        piezas.add(new Alfil(5, 7, ColorPieza.BLANCO, 'A'));
        piezas.add(new Caballo(6, 7, ColorPieza.BLANCO, 'C'));
        piezas.add(new Torre(7, 7, ColorPieza.BLANCO, 'T'));


        for(Pieza pieza : piezas){
            int x = pieza.getPosicion().getX();
            int y = pieza.getPosicion().getY();
            tablero[y][x] = pieza.getSimbolo();
        }
    }

    public void imprimirTablero(){
        for (char[] chars : tablero) {
            for (char aChar : chars) System.out.print(aChar);
            System.out.println();
        }
    }

    public void moverPieza(Pieza pieza, int desplazamientoX, int desplazamientoY){
        int x = pieza.getPosicion().getX();
        int y = pieza.getPosicion().getY();
        if((x + desplazamientoX)  >= 8 || (x + desplazamientoX) <= 0 || (y  + desplazamientoY))
    }
}