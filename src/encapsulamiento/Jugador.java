package encapsulamiento;

public class Jugador {

    private String nombre;
    private int puntajeActual;
    private int puntajeMaximo;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntajeActual = 0;
        this.puntajeMaximo = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntajeActual() {
        return puntajeActual;
    }

    public int getPuntajeMaximo() {
        return puntajeMaximo;
    }

    public void actualizarPuntaje(int nuevoPuntaje) {
        if (nuevoPuntaje >= 0) {
            puntajeActual = nuevoPuntaje;

            if (nuevoPuntaje > puntajeMaximo) {
                puntajeMaximo = nuevoPuntaje;
            }
        }
    }
}