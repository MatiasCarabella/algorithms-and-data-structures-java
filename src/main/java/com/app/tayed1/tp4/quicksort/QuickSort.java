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
/*
class QuickSort {
   // Método público para iniciar el ordenamiento
    public static void ordenar(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        quicksort(arr, 0, arr.length - 1);
    }

    // Método privado para implementar el algoritmo Quicksort
    private static void quicksort(int[] arr, int bajo, int alto) {
        int i = bajo, j = alto;
        // Seleccionar el pivote en la posición central
        int pivote = arr[bajo + (alto - bajo) / 2];

        // Dividir en subarreglos menores y mayores al pivote
        while (i <= j) {
            while (arr[i] > pivote) {
                i++;
            }
            while (arr[j] < pivote) {
                j--;
            }
            if (i <= j) {
                intercambiar(arr, i, j);
                i++;
                j--;
            }
        }

        // Llamadas recursivas para los subarreglos
        if (bajo < j) {
            quicksort(arr, bajo, j);
        }
        if (i < alto) {
            quicksort(arr, i, alto);
        }
    }

    // Método privado para intercambiar elementos en el arreglo
    private static void intercambiar(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
 */ 