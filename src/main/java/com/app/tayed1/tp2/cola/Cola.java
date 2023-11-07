package main.java.com.app.tayed1.tp2.cola;

import main.java.com.app.tayed1.tp2.pedido.Pedido;

public class Cola {
    private Nodo frente;
    private Nodo finalCola;

    public Cola() {
        frente = null;
        finalCola = null;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public void encolar(Pedido pedido) {
        Nodo nuevoNodo = new Nodo(pedido);
        if (estaVacia()) {
            frente = nuevoNodo;
            finalCola = nuevoNodo;
        } else {
            finalCola.siguiente = nuevoNodo;
            finalCola = nuevoNodo;
        }
    }

    public Pedido desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía.");
        }
        Pedido pedidoDesencolado = frente.pedido;
        frente = frente.siguiente;
        if (frente == null) {
            finalCola = null;
        }
        return pedidoDesencolado;
    }

    public Pedido frente() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía.");
        }
        return frente.pedido;
    }

    public int size() {
        int count = 0;
        Nodo actual = frente;
        while (actual != null) {
            count++;
            actual = actual.siguiente;
        }
        return count;
    }

    public void mostrarCola() {
        Nodo actual = frente;
        while (actual != null) {
            Pedido pedido = actual.pedido;
            System.out.println("Código: " + pedido.getCodigo() + ", Cliente: " + pedido.getNombreCliente() + ", Cantidad: " + pedido.getCantidadLadrillos());
            actual = actual.siguiente;
        }
    }

    private class Nodo {
        Pedido pedido;
        Nodo siguiente;

        public Nodo(Pedido pedido) {
            this.pedido = pedido;
            this.siguiente = null;
        }
    }
}