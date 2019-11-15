package lab.pkg6_josezuniga_31841432;

public class Montapuerco extends Cartas{

    public Montapuerco() {
    }

    public Montapuerco(String nombre, int puntosDanio, int puntosVida) {
        super(Montapuerco.class.getSimpleName(),puntosDanio, puntosVida);
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
        return "Especial";
    }

    @Override
    public String objetivo() {
        return "Terrestres";
    }
}
