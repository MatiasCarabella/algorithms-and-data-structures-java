package main.java.com.app.tp2.nodo;

public class Nodo {
    /**
     * La clase Nodo posee 2 atributos:
     * info - es un entero que almacena el valor en sí del nodo
     * sig - una referencia al siguiente nodo en la lista enlazada
     */
    public int info;
    public Nodo sig;

    public Nodo (int info) {
        // El constructor de Nodo recibe el valor entero a almacenar en info
        this.info = info;
    }
}
