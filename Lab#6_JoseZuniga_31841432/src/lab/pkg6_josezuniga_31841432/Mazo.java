package lab.pkg6_josezuniga_31841432;

import java.util.ArrayList;

public class Mazo {
    private int costo;
    private ArrayList<Cartas> cartas = new ArrayList<>();

    public Mazo() {
        calacularCosto();
    }    
    
    private void calacularCosto(){
        int costo = 0;
        for (Cartas carta : cartas) {
            costo += carta.costeElixir();
        }
        costo /= cartas.size();
        this.costo = costo;
    }

    public ArrayList<Cartas> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Cartas> cartas) {
        this.cartas = cartas;
        calacularCosto();
    }
    
    public Cartas getCarta(int pos) {
        return cartas.get(pos);
    }

    public void setCarta(Cartas carta) {
        this.cartas.add(carta);
        calacularCosto();
    }
}
