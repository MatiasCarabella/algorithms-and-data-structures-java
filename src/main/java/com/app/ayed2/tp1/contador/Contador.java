package main.java.com.app.ayed2.tp1.contador;

public class Contador {
  public static void conteoDeFrecuencia(String palabra) {
    int[] conteos = new int[26];

    /**
     * Inicializamos la variable ultimoCaracter, que almacenará, justamente,
     * el último caracter leído de la palabra, para así poder dar un mensaje
     * descriptivo en caso de Excepción.
     */
    char ultimoCaracter = '.';
    /*
     * Cuenta la frecuencia de cada letra, lo englobamos dentro de una estructura try-catch
     * para manejar las Excepiones que puedan surgir.
     */
    try {
      for (int i = 0; i < palabra.length(); i++) {
        ultimoCaracter = palabra.charAt(i);
        conteos[ultimoCaracter - 'A']++;
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      // En caso de Excepción, mostramos el ultimoCaracter leído, causante de la Excepcion
      System.out.println("No es un caracter: '" + ultimoCaracter + "'");
    }

    // Imprimir frecuencias...
    System.out.println();
    for (int i = 0; i < conteos.length; i++) {
      if (conteos[i] != 0) {
        System.out.println((char)(i + 'A') + ": " + conteos[i]);
      }
    }
  }

  public static int cantidadDeOcurrencias(String[] palabras, String palabra) {
    int contador = 0;
    for (int i = 0; i < palabras.length - 1; i++) {
      if (palabras[i] == null) {
        break;
      }
      if (palabras[i].equalsIgnoreCase(palabra)) {
        contador += 1;
      }
    }
    return contador;
  }
}