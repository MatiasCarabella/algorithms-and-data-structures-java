package main.java.com.app.ayed2.tp2.nodobinario;

// Definición de la clase NodoBinario
public class NodoBinario {
    public int dato;
    public NodoBinario Hizq, Hder;

    // Constructor
    public NodoBinario(int elem) {
        // Dato a almacenar
        this.dato = elem;
        // Definición de hijos
        this.Hizq = null;
        this.Hder = null;
    }
}