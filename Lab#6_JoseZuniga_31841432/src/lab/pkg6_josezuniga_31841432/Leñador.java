package lab.pkg6_josezuniga_31841432;

public class Leñador extends Cartas{

    public Leñador() {
    }

    public Leñador(int puntosDanio, int puntosVida) {
        super(Leñador.class.getSimpleName(), puntosDanio, puntosVida);
    }
        @Override
    public String velocidad() {
        return "Alta";
    }

    @Override
    public int costeElixir() {
        return 4;
    }

    @Override
    public String tipo() {
        return "Legendaria";
    }

    @Override
    public String objetivo() {
        return "Terrestres";
    }
    
}
