package lab.pkg6_josezuniga_31841432;

public class Dragon extends Cartas {

    public Dragon() {
    }

    public Dragon(String nombre, int puntosDanio, int puntosVida) {
        super(nombre, puntosDanio, puntosVida);
    }
    
    @Override
    public String velocidad() {
        return "Media";
    }

    @Override
    public int costeElixir() {
        return 4;
    }

    @Override
    public String tipo() {
        return "Epica";
    }

    @Override
    public String objetivo() {
        return "Aereos y Terrestres";
    }
}
