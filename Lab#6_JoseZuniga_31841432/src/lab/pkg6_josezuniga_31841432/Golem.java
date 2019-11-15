package lab.pkg6_josezuniga_31841432;

public class Golem extends Cartas{

    public Golem() {
    }

    public Golem(String nombre, int puntosDanio, int puntosVida) {
        super(nombre, puntosDanio, puntosVida);
    }
    
        @Override
    public String velocidad() {
        return "Baja";
    }

    @Override
    public int costeElixir() {
        return 8;
    }

    @Override
    public String tipo() {
        return "Epica";
    }

    @Override
    public String objetivo() {
        return "Terrestres";
    }
}
