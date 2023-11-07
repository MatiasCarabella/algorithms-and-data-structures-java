package main.java.com.app.menu;

import java.util.Scanner;

import main.java.com.app.ayed1.tp1.edificio.Edificio;
import main.java.com.app.ayed1.tp1.oficina.Oficina;
import main.java.com.app.ayed1.tp2.pila.Pila;
import main.java.com.app.ayed1.tp3.hash.Hash;
import main.java.com.app.ayed1.tp4.mergesort.MergeSort;
import main.java.com.app.ayed1.tp4.quicksort.QuickSort;
import main.java.com.app.tayed1.tp1.contador.Contador;

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
    int opcionSubmenu;
    Scanner teclado = new Scanner(System.in);
    do {
      System.out.println("");
      System.out.println("Seleccione una opción:");
      System.out.println("1. TP1: Manejo de objetos, arreglos y excepciones");
      System.out.println("TP2: Pilas y Colas");
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
        // Generamos un array de palabras que almacenará hasta 50 palabras.
        String[] palabras = new String[50];
        /**
         * Inicializamos también un contador que usaremos al momento de 
         * ingresar nuevas palabras en la primera posición vacía del array,
         * por eso lo inicializamos en 0.
         */
        int cantidadPalabras = 0;

        // Leer una palabra del usuario
        System.out.print("Ingrese una palabra (por favor, sólo letras): ");
        String palabra = teclado.nextLine();

        // Convertir a mayúsculas
        palabra = palabra.toUpperCase();

        /**
         * Agregamos la palabra a nuestra lista de palabras
         * e incrementamos en 1 nuestro contador de palabras ingresadas
         */
        palabras[cantidadPalabras] = palabra;
        cantidadPalabras++;

        do {
          System.out.println("");
          System.out.println("Seleccione una opción:");
          System.out.println("1. Ingresar más palabras");
          System.out.println("2. Listar palabras ingresadas");
          System.out.println("3. Conteo de caracteres de una palabra");
          System.out.println("4. Conteo de ocurrencias de una palabra");
          System.out.println("0. Salir");
          System.out.println("");
          System.out.print("Opción: ");

          // Validación del input del usuario
          while (!teclado.hasNextInt()) {
            System.out.println("Opción inválida, por favor inténtalo nuevamente.");
            System.out.print("Opción: ");
            teclado.next();
          }
          opcionSubmenu = teclado.nextInt();

          switch (opcionSubmenu) {
          case 1:
            // Leer palabra del usuario
            System.out.print("Ingrese una palabra (por favor, sólo letras): ");
            teclado.nextLine();
            palabra = teclado.nextLine();
            // Convertir a mayúsculas
            palabra = palabra.toUpperCase();
            // Agregamos la palabra a nuestra lista de palabras
            palabras[cantidadPalabras] = palabra;
            cantidadPalabras++;
            break;
          case 2:
            System.out.print("\nPalabras ingresadas: \n");
            for (int i = 0; i < palabras.length; i++) {
              if (palabras[i] == null) {
                break;
              }
              System.out.println((i+1) + ". " + palabras[i]);
            }
            System.out.println("");
            presionaEnterParaContinuar();
            teclado.nextLine();
            break;
          case 3:
            String opcionPalabra;
            System.out.print("\nPalabras ingresadas: \n");
            for (int i = 0; i < palabras.length; i++) {
              if (palabras[i] == null) {
                break;
              }
              System.out.println((i+1) + ". " + palabras[i]);
            }

            System.out.println("Ingresa el número de palabra sobre la cual deseas realizar el conteo de caracteres ");
            System.out.println("");
            System.out.print("Opción: ");
            opcionPalabra = teclado.next();
            /**
             * Validación del input del usuario:
             * - Debe ser un número
             * - Debe ser una opción válida (entre 1 y cantidadPalabras)
             */
            while (!(isNumeric(opcionPalabra) && 
                    Integer.parseInt(opcionPalabra) >=1 && 
                    Integer.parseInt(opcionPalabra) <= cantidadPalabras) ) {
              System.out.println("Opción inválida, por favor inténtalo nuevamente.");
              System.out.print("Opción: ");
              opcionPalabra = teclado.next();
            }
            /**
             * Nos traemos la palabra de la lista, su índice será la opción menos 1,
             * puesto que el array comienza en 0
             */
            palabra = palabras[Integer.parseInt(opcionPalabra)-1];
            System.out.println("Palabra elegida: " + palabra);
            Contador.conteoDeFrecuencia(palabra);
            presionaEnterParaContinuar();
            break;
          case 4:
            System.out.print("\nPalabras ingresadas: \n");
            for (int i = 0; i < palabras.length; i++) {
              if (palabras[i] == null) {
                break;
              }
              System.out.println((i+1) + ". " + palabras[i]);
            }
    
            System.out.println("Ingresa el número de palabra de la cual deseas realizar el conteo de ocurrencias.");
            System.out.println("");
            System.out.print("Opción: ");
            opcionPalabra = teclado.next();
            /**
             * Validación del input del usuario:
             * - Debe ser un número
             * - Debe ser una opción válida (entre 1 y cantidadPalabras)
             */
            while (!(isNumeric(opcionPalabra) && 
                    Integer.parseInt(opcionPalabra) >=1 && 
                    Integer.parseInt(opcionPalabra) <= cantidadPalabras) ) {
              System.out.println("Opción inválida, por favor inténtalo nuevamente.");
              System.out.print("Opción: ");
              opcionPalabra = teclado.next();
            }
            /**
             * Nos traemos la palabra de la lista, su índice será la opción menos 1,
             * puesto que el array comienza en 0
             */
            palabra = palabras[Integer.parseInt(opcionPalabra)-1];
            System.out.println("La palabra elegida, '" + palabra + "' se repite " +
                              Contador.cantidadDeOcurrencias(palabras, palabra) + " veces.");
            presionaEnterParaContinuar();
            break;
          case 0:
            System.out.println("¡Hasta pronto!");
            break;
          default:
            System.out.println("Opción inválida, por favor inténtalo nuevamente.");
          }
        } while (opcionSubmenu != 0);
        break;
      case 2
      :
        do {
          System.out.println("");
          System.out.println("Seleccione una opción:");
          System.out.println("1. PILA");
          System.out.println("2. COLA");
          System.out.println("0. Salir");
          System.out.println("");
          System.out.print("Opción: ");

          // Validación del input del usuario
          while (!teclado.hasNextInt()) {
            System.out.println("Opción inválida, por favor inténtalo nuevamente.");
            System.out.print("Opción: ");
            teclado.next();
          }
          opcionSubmenu = teclado.nextInt();

          switch (opcionSubmenu) {
            case 0:
            System.out.println("¡Hasta pronto!");
            break;
          default:
            System.out.println("Opción inválida, por favor inténtalo nuevamente.");
          }
        } while (opcionSubmenu != 0);
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

  // Helper methods
  private static void MostrarArray(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; ++i)
      System.out.print(arr[i] + " ");
    System.out.println();
  }

  private static void presionaEnterParaContinuar() {
    System.out.println("Presiona ENTER para continuar...");
    try {
      System.in.read();
    } catch (Exception e) {
      System.out.println("Error");
    }
  }

  public static boolean isNumeric(String str) { 
    try {  
      Double.parseDouble(str);  
      return true;
    } catch(NumberFormatException e){  
      return false;  
    }  
  }
}