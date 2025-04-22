package Ajedrez.Solucion;

public class Posicion {
    private int x;
    private int y;

    public Posicion(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

   public void cambiarPosicion(int x, int y){
        this.x += x;
        this.y += y;
   }
}
