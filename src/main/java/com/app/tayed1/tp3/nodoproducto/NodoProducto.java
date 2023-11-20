package main.java.com.app.tayed1.tp3.nodoproducto;

import main.java.com.app.tayed1.tp3.producto.Producto;

public class NodoProducto {
    public Producto producto;
    public NodoProducto anterior;
    public NodoProducto siguiente;

    public NodoProducto(Producto producto) {
        this.producto = producto;
        this.anterior = null;
        this.siguiente = null;
    }
}