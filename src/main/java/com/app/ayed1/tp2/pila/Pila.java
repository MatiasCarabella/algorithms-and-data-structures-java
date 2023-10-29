package main.java.com.app.ayed1.tp2.pila;

import main.java.com.app.ayed1.tp2.nodo.Nodo;

public class Pila {
    // Nombre: Matías Carabella
    // Legajo: VINF014247
    // DNI: 40676324

    /**
     * La clase Pila posee 1 atributo:
     * raiz - una referencia al nodo raíz o 'tope' de la pila
     */
    private Nodo raiz;

    public Pila() {
        // El constructor de la pila inicializa la raíz en null
        this.raiz = null;
    }

    public void apilar(int x) {
        // Para apilar un elemento, primero creamos un nodo con el valor deseado
        Nodo nuevo = new Nodo(x);
        // Este nuevo nodo tendrá como siguiente nodo al anterior 'tope' de la pila o raíz
        nuevo.sig = raiz;
        // Finalmente, el nuevo nodo pasa a ser el nuevo 'tope' de la pila o raíz
        this.raiz = nuevo;
    }

    public int desapilar() {
        // Para desapilar un elemento, primero obtenemos el valor actual del 'tope' de la pila
        int info = raiz.info;
        // Luego, movemos el 'tope' o raíz de la pila al elemento siguiente de la actual raíz
        this.raiz = raiz.sig;
        // Finalmente, devolvemos el valor de la ex-raíz que acabamos de quitar de la pila
        return info;
    }

    public void verContenido() {
        // Para mostrar el contenido de nuestra pila, partimos de la raiz y luego iteramos:
        Nodo nodo = this.raiz;
        while (nodo != null) {
            // Mientras el nodo actual no sea null, mostraremos su valor y pasaremos al siguiente
            System.out.print(nodo.info);
            if (nodo.sig != null) {
                // Para fines estéticos, mostramos una flecha '->' si el nodo siguiente no es nulo
                System.out.print(" -> ");
            }
            nodo = nodo.sig;
        }
        System.out.println("");
    }
}