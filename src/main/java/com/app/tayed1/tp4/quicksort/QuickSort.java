package main.java.com.app.tayed1.tp4.quicksort;

import main.java.com.app.tayed1.tp4.equipo.Equipo;

public class QuickSort {
    // Método público para iniciar el ordenamiento de los equipos por puntaje
    public static void ordenar(Equipo[] equipos) {
        if (equipos == null || equipos.length == 0) {
            return;
        }
        quicksort(equipos, 0, equipos.length - 1);
    }

    // Método privado para implementar el algoritmo QuickSort
    private static void quicksort(Equipo[] equipos, int bajo, int alto) {
        // Seleccionar el pivote en la posición central
        int i = bajo, j = alto;
        int pivot = equipos[bajo + (alto - bajo) / 2].puntos;

        // Dividir en subarrays menores y mayores al pivote
        while (i <= j) {
            while (equipos[i].puntos > pivot) {
                i++;
            }
            while (equipos[j].puntos < pivot) {
                j--;
            }
            if (i <= j) {
                intercambiar(equipos, i, j);
                i++;
                j--;
            }
        }

        // Llamadas recursivas para los subarrays
        if (bajo < j) {
            quicksort(equipos, bajo, j);
        }
        if (i < alto) {
            quicksort(equipos, i, alto);
        }
    }

    // Método privado para intercambiar elementos en el array de equipos
    private static void intercambiar(Equipo[] equipos, int i, int j) {
        Equipo temp = equipos[i];
        equipos[i] = equipos[j];
        equipos[j] = temp;
    }
}