// Nombre: Matías Carabella
// Legajo: VINF014247
// DNI: 40676324

package main.java.com.app.ayed2.tp3.ABB;

// Clase de Arbol Binario de Búsquada ABB
public class ABB {

    //Clase Nodo de un ABB
    class Nodo {
        int clave;
        Nodo izquierda, derecha;
        public Nodo(int data) {
            clave = data;
            izquierda = derecha = null;
        }
    }

    // Nodo raiz, dato referencial
    Nodo raiz;

    // Constructor de ABB => se inicializa como arbol vacío
    public ABB() {
        raiz = null;
    }

    //Borrar un Nodo de un árbol ABB
    public void borrarClave(int clave) {
        raiz = borrar_Recursivo(raiz, clave);
    }

    //Borrado recursivo
    Nodo borrar_Recursivo(Nodo raiz, int clave) {
        //Si el Arbol está vacio
        if (raiz == null) return raiz;
        //Recorrer el árbol
        if (clave < raiz.clave) //Recorrer el sub árbol izquierdo
            raiz.izquierda = borrar_Recursivo(raiz.izquierda, clave);
        else if (clave > raiz.clave) //Recorrer el sub árbol derecho
            raiz.derecha = borrar_Recursivo(raiz.derecha, clave);
        else {
            // El nodo contiene solo un hijo
            if (raiz.izquierda == null)
                return raiz.derecha;
            else if (raiz.derecha == null)
                return raiz.izquierda;
            // El Nodo Tiene 2 hijos;
            //Obtener el sucesor inorder (Valor mínimo del subarbol derecho)
            raiz.clave = ValorMinimo(raiz.derecha);
            // Borrar el sucesor inorder
            raiz.derecha = borrar_Recursivo(raiz.derecha, raiz.clave);
        }
        return raiz;
    }
    int ValorMinimo(Nodo raiz) {
        // Inicializar el valor mínimo con la clave de la raíz
        int minValor = raiz.clave;

        // Mientras haya un nodo a la izquierda
        while (raiz.izquierda != null) {
            // Actualizar el valor mínimo con la clave del nodo a la izquierda
            minValor = raiz.izquierda.clave;
            // Moverse hacia la izquierda en el árbol
            raiz = raiz.izquierda;
        }

        // Devolver el valor mínimo encontrado
        return minValor;
    }
    // Insertar Nodo en ABB
    public void insertar(int clave) {
        raiz = insertar_Recursivo(raiz, clave);
    }
    // Método para insertar un nodo de manera recursiva en el árbol
    Nodo insertar_Recursivo(Nodo raiz, int clave) {
        // Si la raíz es nula, se crea un nuevo nodo con la clave dada
        if (raiz == null) {
            raiz = new Nodo(clave);
            return raiz;
        }

        // Si la clave es menor que la clave de la raíz, se inserta en el subárbol izquierdo
        if (clave < raiz.clave)
            raiz.izquierda = insertar_Recursivo(raiz.izquierda, clave);
        // Si la clave es mayor que la clave de la raíz, se inserta en el subárbol derecho
        else if (clave > raiz.clave)
            raiz.derecha = insertar_Recursivo(raiz.derecha, clave);

        // Devolver la raíz del subárbol modificado
        return raiz;
    }
    // Método de recorrido inroder para ABB
    public void inorder() {
        inorder_Recursive(raiz);
    }
    // Recorrido inorder recursivo ABB
    void inorder_Recursive(Nodo raiz) {
        if (raiz != null) {
            inorder_Recursive(raiz.izquierda);
            System.out.print(raiz.clave + " ");
            inorder_Recursive(raiz.derecha);
        }
    }
    public boolean buscar(int clave) {
        raiz = buscar_Recursivo(raiz, clave);
        if (raiz != null)
            return true;
        else
            return false;
    }
    // Busqueda recursiva
    Nodo buscar_Recursivo(Nodo raiz, int clave) {
        // Caso Base raiz es null o la clave esta presente como raiz
        if (raiz == null || raiz.clave == clave)
            return raiz;
        // val is greater than raiz's clave
        if (raiz.clave > clave)
            return buscar_Recursivo(raiz.izquierda, clave);
        // val is less than raiz's clave
        return buscar_Recursivo(raiz.derecha, clave);
    }
}