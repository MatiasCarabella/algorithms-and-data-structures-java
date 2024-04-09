package main.java.com.app.ayed2.tp2.arbol;

import main.java.com.app.ayed2.tp2.nodobinario.NodoBinario;

//Definición de la clase Arbol
public class Arbol {
    public NodoBinario padre;
    public NodoBinario raiz;

    // Constructor
    public Arbol() {
        this.raiz = null;
    }

    /**
     * Se codificaron 2 métodos y en caso de que el nodo padre de
     * referencia sea nulo se asume que es la raíz
     */
    // Inserción de un hijo izquierdo
    public NodoBinario InsertaNodoHIzq(NodoBinario Nodo, int elem) {
        NodoBinario result = null;
        if (Nodo == null) {
            NodoBinario NodoAux = new NodoBinario(elem);
            result = NodoAux;
            this.raiz = NodoAux;
        } else {
            if (Nodo.Hizq == null) {
                NodoBinario NodoAux = new NodoBinario(elem);
                Nodo.Hizq = NodoAux;
                result = NodoAux;
            } else
                System.out.print("ERR- Hijo izquierdo de " + elem + " no es nulo");
        }
        return result;
    }

    // Inserción de un hijo derecho
    public NodoBinario InsertaNodoHDer(NodoBinario Nodo, int elem) {
        NodoBinario result = null;
        if (Nodo == null) {
            NodoBinario NodoAux = new NodoBinario(elem);
            result = NodoAux;
            this.raiz = NodoAux;
        } else {
            if (Nodo.Hder == null) {
                NodoBinario NodoAux = new NodoBinario(elem);
                Nodo.Hder = NodoAux;
                result = NodoAux;
            } else
                System.out.print("ERR- Hijo Derecho de " + elem + " no es nulo");
        }
        return result;
    }

    // Inorden Recursivo del arbol
    public void Inorden(NodoBinario Nodo) {
        if (Nodo != null) {
            Inorden(Nodo.Hizq); // Paso 1 y 2: Recorre el hijo izquierdo
            System.out.print(Nodo.dato + " "); // Paso 3: Imprime el valor del nodo
            Inorden(Nodo.Hder); // Paso 4: Recorre el hijo derecho
        }
    }

    // Altura del arbol
    public int Altura(NodoBinario Nodo) {
        if (Nodo == null) {
            return -1; // Si el nodo es nulo, la altura es -1 (para contar desde la raíz)
        } else {
            // Calcula la altura de los subárboles izquierdo y derecho recursivamente
            int alturaIzquierda = Altura(Nodo.Hizq);
            int alturaDerecha = Altura(Nodo.Hder);

            // La altura del árbol es la máxima altura de los subárboles izquierdo y
            // derecho,
            // más 1 (para contar el nivel del nodo actual)
            return Math.max(alturaIzquierda, alturaDerecha) + 1;
        }
    }
}