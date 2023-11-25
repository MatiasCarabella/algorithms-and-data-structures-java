package main.java.com.app.tayed1.tp4.equipo;

public class Equipo {
    public String nombre;
    public int puntos;

    public Equipo(String nombre, int puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public String mostrar() {
        return nombre + ": " + puntos + " puntos";
    }
}
