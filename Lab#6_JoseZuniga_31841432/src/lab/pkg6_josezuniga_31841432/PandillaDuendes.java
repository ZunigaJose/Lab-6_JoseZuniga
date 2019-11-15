package lab.pkg6_josezuniga_31841432;

public class PandillaDuendes extends Cartas{

    public PandillaDuendes() {
    }

    public PandillaDuendes(String nombre,int puntosDanio, int puntosVida) {
        super(nombre, puntosDanio, puntosVida);
    }
    
        @Override
    public String velocidad() {
        return "Alta";
    }

    @Override
    public int costeElixir() {
        return 3;
    }

    @Override
    public String tipo() {
        return "Comun";
    }

    @Override
    public String objetivo() {
        return "Aereos y Terrestres";
    }
    
}
