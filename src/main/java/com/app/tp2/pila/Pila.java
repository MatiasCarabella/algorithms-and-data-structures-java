package main.java.com.app.tp2.pila;

import main.java.com.app.tp2.nodo.Nodo;

public class Pila {

    private Nodo raiz;

    public Pila() {
        this.raiz = null;
    }

    public void apilar(int x) {
        Nodo nuevo = new Nodo(x);
        nuevo.sig = raiz;
        this.raiz = nuevo;
    }

    public int desapilar() {
        int info = raiz.info;
        this.raiz = raiz.sig;
        return info;
    }

    public void verContenido() {
        Nodo nodo = this.raiz;
        while (nodo != null) {
            System.out.print(nodo.info);
            if (nodo.sig != null) {
                System.out.print(" -> ");
            }
            nodo = nodo.sig;
        }
        System.out.println("");
    }
}