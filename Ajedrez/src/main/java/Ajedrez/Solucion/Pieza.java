package Ajedrez.Solucion;

public abstract class Pieza {
    private final Posicion posicion;
    private final Tablero.ColorPieza colorPieza;
    private final char simbolo;
    protected final Tablero tablero;

    public Pieza(int posX, int posY, Tablero.ColorPieza colorPieza, char simbolo, Tablero tablero){
        posicion = new Posicion(posX, posY);
        this.colorPieza = colorPieza;
        this.simbolo = simbolo;
        this.tablero = tablero;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public char getSimbolo(){
        return simbolo;
    }

    public Tablero.ColorPieza getColor(){
        return colorPieza;
    }

    public boolean hayPiezaEntre(Posicion origen, Posicion destino){
        int origenX = origen.getX();
        int origenY = origen.getY();
        int destinoX = destino.getX();
        int destinoY = destino.getY();
        char[][] tablaAjedrez = tablero.getTablero();

        while(origenX != destinoX || origenY != destinoY){
            if(origenY != destinoY){
                if(destinoY - origenY > 0)
                    origenY += 1;
                else
                    origenY -= 1;
            }
            if (origenX != destinoX){
                if(destinoX - origenX > 0)
                    origenX += 1;
                else
                    origenX -= 1;
            }
            if(tablaAjedrez[origenY][origenX] == ' ' || tablaAjedrez[origenY][origenX] == '.')
                continue;
            return true;
        }
        return false;
    }

    public abstract boolean movimientoValido(Posicion casillero);

    public boolean moverPieza(Posicion casillero){

        if(movimientoValido(casillero)) {
            posicion.cambiarPosicion(casillero.getX(), casillero.getY());
            return true;
        }
        return false;
    }
}