package main.java.com.app.ayed1.tp4.quicksort;

public class QuickSort {
  // Nombre: Matías Carabella
  // Legajo: VINF014247
  // DNI: 40676324

  /* Esta función toma el último elemento como pivote, 
  * coloca el elemento pivote en su posición correcta en la matriz
  ordenada
  * y coloca todos los elementos más pequeños (más pequeños que pivote) 
  * a la izquierda del pivote y todos los elementos mayores a la derecha
  del pivote.
  */
  private int particion(int arr[], int low, int high) {
    int pivot = arr[high];
    int i = (low - 1); // índice del elemento mas chico
    for (int j = low; j < high; j++) {
      // Si el elemento actual es mas chico o igual que el pivot
      if (arr[j] <= pivot) {
        i++;
        // swap arr[i] and arr[j]
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    // Intercambia arr[i+1] y arr[high] (o pivot)
    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;
    return i + 1;
  }
  /* Método principal que implementa quicksort
  arr[] --> Array a ser ordenado,
  low --> Comienzo de indice,
  high --> Fin de indice */
  public void ordenar(int arr[], int low, int high) {
    if (low < high) {
        // Obtenemos i, el índice donde haremos la partición
        int i = particion(arr, low, high);
        /**
         * Llamamos recursivamente a ordenar(), ordenando así
         * los elementos antes y después de la partición
        */ 
        ordenar(arr, low, i-1);
        ordenar(arr, i+1, high);
    }
  }
}