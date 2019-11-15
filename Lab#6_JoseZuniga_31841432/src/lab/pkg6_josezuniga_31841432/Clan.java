package lab.pkg6_josezuniga_31841432;

import java.util.ArrayList;
import java.util.Date;

public class Clan {
    private String nombre, tipo;
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private Date fechaCreacion;
    private Usuario lider;

    public Clan() {
    }

    public Clan(String nombre, String tipo, Date fechaCreacion, Usuario lider) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechaCreacion = fechaCreacion;
        this.lider = lider;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    public Usuario getUsuario(int pos) {
        return usuarios.get(pos);
    }

    public void setUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Usuario getLider() {
        return lider;
    }

    public void setLider(Usuario lider) {
        this.lider = lider;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
