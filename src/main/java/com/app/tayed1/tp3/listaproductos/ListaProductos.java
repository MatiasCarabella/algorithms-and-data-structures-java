package main.java.com.app.tayed1.tp3.listaproductos;

import main.java.com.app.tayed1.tp3.producto.Producto;
import main.java.com.app.tayed1.tp3.nodoproducto.NodoProducto;

public class ListaProductos {
    NodoProducto inicio;

    public ListaProductos() {
        this.inicio = null;
    }

    // Método para insertar un producto en la lista
    public void insertarProducto(Producto nuevoProducto) {
        NodoProducto nuevoNodo = new NodoProducto(nuevoProducto);
        System.out.print("Insertando... "); nuevoProducto.mostrar();
        // Caso: La lista está vacía
        if (inicio == null) {
            inicio = nuevoNodo;
        } else {
            NodoProducto actual = inicio;

            // Recorre la lista para encontrar la posición adecuada para el nuevo producto
            while (actual != null) {
                // Verifica si el código del producto ya existe en la lista
                if (actual.producto.codigo == nuevoProducto.codigo) {
                    System.out.println("ERROR: El código " + nuevoProducto.codigo + " ya existe. El producto '" + nuevoProducto.descripcion + "' no fue insertado.");
                    return;
                }

                // Inserta el nuevo producto en la posición correcta según el código
                if (actual.producto.codigo > nuevoProducto.codigo) {
                    // Caso: Nuevo producto debe ir al inicio de la lista
                    if (actual.anterior == null) {
                        nuevoNodo.siguiente = actual;
                        actual.anterior = nuevoNodo;
                        inicio = nuevoNodo;
                    } else {
                        // Caso: Nuevo producto debe ir en medio de la lista
                        nuevoNodo.siguiente = actual;
                        nuevoNodo.anterior = actual.anterior;
                        actual.anterior.siguiente = nuevoNodo;
                        actual.anterior = nuevoNodo;
                    }
                    return;
                }

                // Caso: Nuevo producto debe ir al final de la lista
                if (actual.siguiente == null) {
                    actual.siguiente = nuevoNodo;
                    nuevoNodo.anterior = actual;
                    return;
                }

                // Mueve al siguiente nodo en la lista
                actual = actual.siguiente;
            }
        }
    }

    // Método para listar todos los productos en la lista
    public void listarProductos() {
        NodoProducto actual = inicio;

        // Recorre la lista e imprime cada producto
        while (actual != null) {
            actual.producto.mostrar();
            actual = actual.siguiente;
        }
    }
}