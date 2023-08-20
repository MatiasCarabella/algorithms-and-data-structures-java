package main.java.com.app.menu;

import java.util.Scanner;
import main.java.com.app.tp1.edificio.Edificio;
import main.java.com.app.tp1.oficina.Oficina;

public class Menu {

    private Scanner sc; // objeto para leer datos por teclado

    // Constructor:
    public Menu() {
        sc = new Scanner(System.in);
    }

    public void mostarMenu() throws Exception {
    int opcion;
    do {
      System.out.println("");
      System.out.println("Seleccione una opción:");
      System.out.println("1. TP1: Algoritmos de búsqueda - Notación O");
      System.out.println("2. TP2: Estructuras de Datos - Pilas - Listas Enlazadas");
      System.out.println("0. Salir");
      
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
        break;
      case 0:
        System.out.println("¡Hasta pronto!");
        break;
      default:
        System.out.println("Opción inválida, por favor inténtalo nuevamente.");
      }
    } while (opcion != 0);
  }
}
