package Ajedrez.Solucion;

import javax.swing.*;

public class Pieza {
    private final Posicion posicion;
    private final Tablero.ColorPieza colorPieza;
    private final char simbolo;

    public Pieza(int posX, int posY, Tablero.ColorPieza colorPieza, char simbolo){
        posicion = new Posicion(posX, posY);
        this.colorPieza = colorPieza;
        this.simbolo = simbolo;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public char getSimbolo(){
        return simbolo;
    }
}
