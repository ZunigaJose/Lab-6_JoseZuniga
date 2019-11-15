package lab.pkg6_josezuniga_31841432;

public class GiganteNoble extends Cartas{

    public GiganteNoble() {
    }

    public GiganteNoble(int puntosDanio, int puntosVida) {
        super("Gigante Noble", puntosDanio, puntosVida);
    }
    
        @Override
    public String velocidad() {
        return "Media";
    }

    @Override
    public int costeElixir() {
        return 6;
    }

    @Override
    public String tipo() {
        return "Comun";
    }

    @Override
    public String objetivo() {
        return "Terrestres";
    }
}
