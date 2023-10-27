package main.java.com.app.menu;

import java.util.Scanner;
import main.java.com.app.tp1.edificio.Edificio;
import main.java.com.app.tp1.oficina.Oficina;
import main.java.com.app.tp2.pila.Pila;
import main.java.com.app.tp3.hash.Hash;
import main.java.com.app.tp4.mergesort.MergeSort;
import main.java.com.app.tp4.quicksort.QuickSort;

public class Menu {

  private Scanner sc; // objeto para leer datos por teclado

  // Constructor:
  public Menu() {
    sc = new Scanner(System.in);
  }

  public void menuPrincipal() throws Exception {
    int opcion;
    do {
      System.out.println("");
      System.out.println("Seleccione la opción correspondiente a la asignatura:");
      System.out.println("1. Algoritmos y Estructuras de Datos I");
      System.out.println("2. Taller de Algoritmos y Estructuras de Datos I");
      System.out.println("3. Algoritmos y Estructuras de Datos II");
      System.out.println("4. Taller de Algoritmos y Estructuras de Datos II");
      System.out.println("0. Salir");
      System.out.println("");
      System.out.print("Opción: ");

      // Validación del input del usuario
      while (!sc.hasNextInt()) {
        System.out.println("Opción inválida, por favor inténtalo nuevamente.");
        sc.next();
      }
      opcion = sc.nextInt();

      switch (opcion) {
      case 1:
        /*** Algoritmos y Estructuras de Datos I ***/
        menuAyED1();
        break;
      case 2:
        /*** Taller de Algoritmos y Estructuras de Datos I ***/
        menuTAyED1();
        break;
      case 3:
        /*** Algoritmos y Estructuras de Datos II ***/
        menuAyED2();
      case 4:
        /*** Taller de Algoritmos y Estructuras de Datos II ***/
        menuTAyED2();
        break;
      case 0:
        System.out.println("¡Hasta pronto!");
        break;
      default:
        System.out.println("Opción inválida, por favor inténtalo nuevamente.");
      }
    } while (opcion != 0);
  }

  public void menuAyED1() throws Exception {
    int opcion;
    do {
      System.out.println("");
      System.out.println("Seleccione una opción:");
      System.out.println("1. TP1: Algoritmos de búsqueda - Notación O");
      System.out.println("2. TP2: Estructuras de Datos - Pilas - Listas Enlazadas");
      System.out.println("3. TP3: Tablas Hash");
      System.out.println("4. TP4: QuickSort - MergeSort");
      System.out.println("0. Salir");
      System.out.println("");
      System.out.print("Opción: ");

      // Validación del input del usuario
      while (!sc.hasNextInt()) {
        System.out.println("Opción inválida, por favor inténtalo nuevamente.");
        sc.next();
      }
      opcion = sc.nextInt();

      switch (opcion) {
      case 1:
        /*** TRABAJO PRÁCTICO #1 ***/
        // Creamos una instancia de Edificio
        Edificio edificio = new Edificio();

        // Llamamos al método cantidadOficinasActivas()
        System.out.println("Cantidad de oficinas activas: " + edificio.cantidadOficinasActivas());

        /**
         *  Llamamos al método encontrarPrimeraOficinaActiva(), aquí implementamos manejo de excepciones pues
         *  en caso de no haber oficinas activas, el método puede retornal null.  
         */
        try {
          Oficina primeraOficina = edificio.encontrarPrimeraOficinaActiva();
          System.out.println("Primera oficina: " + primeraOficina.toString());
        } catch (NullPointerException e) {
          System.out.println("No se encontraron oficinas activas");
        }
        break;
      case 2:
        /*** TRABAJO PRÁCTICO #2 ***/
        Pila pila = new Pila();
        pila.apilar(10);
        pila.apilar(40);
        pila.apilar(3);
        pila.verContenido();
        System.out.println("Desapilando tope de la pila: " + pila.desapilar());
        pila.verContenido();
        break;
      case 3:
        /*** TRABAJO PRÁCTICO #3 ***/
        int i, elemento;

        // Tabla Definida de 15
        int m = 15;
        Hash[] h = new Hash[m];
        for (i = 0; i < m; i++) {
          h[i] = new Hash();
          h[i].estado = 0;
        }

        // Insertar elemento
        Hash.insertaHash(h, m, 15);
        Hash.insertaHash(h, m, 130);
        Hash.insertaHash(h, m, 7);
        Hash.insertaHash(h, m, 32);

        //Buscando un elemento
        elemento = 7;
        i = Hash.buscaHash(h, m, elemento);
        i = Hash.eliminaHash(h, m, 130);
        break;
      case 4:
        /*** TRABAJO PRÁCTICO #4 ***/
        int arr[] = {12,11,13,5,6,7};
        System.out.println("\n Array original antes de MergeSort");
        MostrarArray(arr);
        MergeSort obMS = new MergeSort();
        obMS.ordenar(arr, 0, arr.length - 1);
        System.out.println("\n Array ordenado por Merge Sort");
        MostrarArray(arr);
        int arr2[] = {12,11,13,5,6,7};
        System.out.println("\n Array original antes de QuickSort");
        MostrarArray(arr2);
        int n = arr2.length;
        QuickSort obQS = new QuickSort();
        obQS.ordenar(arr2, 0, n - 1);
        System.out.println("\n Array ordenado por Quick Sort");
        MostrarArray(arr2);
        break;
      case 0:
        System.out.println("¡Hasta pronto!");
        break;
      default:
        System.out.println("Opción inválida, por favor inténtalo nuevamente.");
      }
    } while (opcion != 0);
  }

  public void menuTAyED1() throws Exception {
    int opcion;
    do {
      System.out.println("");
      System.out.println("Seleccione una opción:");
      System.out.println("1. TP1: Manejo de objetos, arreglos y excepciones");
      System.out.println("0. Salir");
      System.out.println("");
      System.out.print("Opción: ");

      // Validación del input del usuario
      while (!sc.hasNextInt()) {
        System.out.println("Opción inválida, por favor inténtalo nuevamente.");
        sc.next();
      }
      opcion = sc.nextInt();

      switch (opcion) {
      case 1:
        /*** TRABAJO PRÁCTICO #1 ***/
        int[] conteos = new int[26]; 
        Scanner teclado = new Scanner(System.in); 
    
        //Leer palabra del usuario
        System.out.print("Ingrese una palabra (por favor, sólo letras): "); 
        String palabra = teclado.nextLine(); 
    
        //Convierte a mayusc.
        palabra = palabra.toUpperCase(); 
    
        //Cuenta la frecuencia de cada letra...
        char ultimoCaracter = '0';
        try {
          for (int i=0; i < palabra.length(); i++) {
            ultimoCaracter = palabra.charAt(i);
            conteos[palabra.charAt(i)-'A']++; 
          }
        } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("No es un caracter: '" + ultimoCaracter + "'");
        }
        

        //imprimir frecuencias...
        System.out.println(); 
        for (int i=0; i < conteos.length; i++) {
            if (conteos [i] != 0) {
              System.out.println((char)(i +'A') + ": " + conteos[i]);
            }
        }
        break;
      case 0:
        System.out.println("¡Hasta pronto!");
        break;
      default:
        System.out.println("Opción inválida, por favor inténtalo nuevamente.");
      }
    } while (opcion != 0);
  }

  public void menuAyED2() {
    System.out.println("Work in progress");
  }

  public void menuTAyED2() {
    System.out.println("Work in progress");
  }

  private static void MostrarArray(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; ++i)
      System.out.print(arr[i] + " ");
    System.out.println();
  }
}