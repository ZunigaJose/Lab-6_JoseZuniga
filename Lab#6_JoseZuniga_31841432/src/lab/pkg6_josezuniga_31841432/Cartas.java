package lab.pkg6_josezuniga_31841432;

public abstract class Cartas {
    private String nombre;
    private int puntosDanio, puntosVida;

    public Cartas() {
    }

    public Cartas(String nombre, int puntosDanio, int puntosVida) {
        this.nombre = nombre;
        this.puntosDanio = puntosDanio;
        this.puntosVida = puntosVida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosDanio() {
        return puntosDanio;
    }

    public void setPuntosDanio(int puntosDanio) {
        this.puntosDanio = puntosDanio;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    @Override
    public String toString() {
        return nombre;
    }
    public abstract String velocidad();
    public abstract int costeElixir();
    public abstract String tipo();
    public abstract String objetivo();
    
}
