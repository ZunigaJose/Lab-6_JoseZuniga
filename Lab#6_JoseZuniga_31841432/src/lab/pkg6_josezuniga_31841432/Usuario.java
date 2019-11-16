package lab.pkg6_josezuniga_31841432;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

public class Usuario {
    private String nombre, apellido, userName, password;
    private Date fechaNacimiento;
    private int edad;
    private Color colorFav;
    private ArrayList<Mazo> mazo = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String userName, String password, Date fechaNacimiento, Color colorFav) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.userName = userName;
        this.password = password;
        this.fechaNacimiento = fechaNacimiento;
        calcularEdad();
        this.colorFav = colorFav;
    }

    private void calcularEdad(){
        Date fechaAct = new Date();
        long tiempo = fechaAct.getTime() - fechaNacimiento.getTime();
        edad = ((int)(tiempo * 1000 * 60 * 60 * 24) / 365);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Color getColorFav() {
        return colorFav;
    }

    public ArrayList<Mazo> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Mazo> mazo) {
        this.mazo = mazo;
    }

    public void setMazos(Mazo mazo) {
        this.mazo.add(mazo);
    }
    
    public void setColorFav(Color colorFav) {
        this.colorFav = colorFav;
    }

    @Override
    public String toString() {
        return userName;
    }
}
