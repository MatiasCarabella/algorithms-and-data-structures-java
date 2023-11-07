package main.java.com.app.tayed1.tp2.pilaarray;

import java.util.EmptyStackException;

public class PilaArray {
    private int maxTamaño;
    private int tope;
    private int[] pila;

    // Constructor que recibe como parámetro el tamaño de la Pila
    public PilaArray(int tamaño) {
        maxTamaño = tamaño;
        pila = new int[maxTamaño];
        tope = -1;  // Inicialmente, la pila está vacía
    }

    public boolean estaVacia() {
        // Retorna true si el tope está en su valor inicial (-1)
        return (tope == -1);
    }

    private boolean estaLlena() {
        // Retorna true si el tope es igual al tamaño máximo de la cola -1
        // (pues el array comienza en la posición 0)
        return (tope == maxTamaño - 1);
    }

    public void push(int valor) {
        /**
         * Verificamos antes que nada que la pila no esté llena, de lo contrario
         * aumentamos el contador de tope (que comienza en -1, pasando así a 0,
         * la primera posición del array) y asignamos el valor
         */
        if (estaLlena()) {
            System.out.println("La pila está llena. No se pueden agregar más elementos.");
        } else {
            pila[++tope] = valor;
        }
    }

    public int pop() {
        /**
         * Verificamos que la pila no esté vacía antes de retornar el valor
         * y disminuir en 1 el tope de la pila (borrado Lógico), 
         * de lo contrario (si ya estaba vacía) arrojamos una excepción
         */
        if (estaVacia()) {
            throw new EmptyStackException();
        } else {
            return pila[tope--];
        }
    }

    public void mostrar() {
        // Método sencillo que recorre el array y muestra sus elementos
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.print("Contenido de la pila: ");
            for (int i = 0; i <= tope; i++) {
                System.out.print(pila[i] + " ");
            }
            System.out.println();
        }
    }
}
