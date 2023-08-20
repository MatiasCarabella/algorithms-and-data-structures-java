package main.java;

import main.java.com.app.tp1.edificio.Edificio;
import main.java.com.app.tp1.oficina.Oficina;

public class App {
    public static void main(String[] args) throws Exception {

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

        /*** TRABAJO PRÁCTICO #2 ***/
        
    }
}
