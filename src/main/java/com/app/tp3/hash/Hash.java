package main.java.com.app.tp3.hash;

public class Hash {
    // Nombre: Matías Carabella
    // Legajo: VINF014247
    // DNI: 40676324

    private int dato;
    public int estado; // 0 = Vacío, 1 = Eliminado, 2 = Ocupado

    public static int FuncionHash(int n, int m) {
        /**
         * n: valor original
         * m: tamaño de la tabla
         * debe devolver una posición int dentro del tamaño m
         */
        return n % m;
        /**
         * Al utilizar la operación módulo con el tamaño de la tabla,
         * nos aseguramos de obtener un valor dentro del rango de la tabla.
         * Ejemplos: Si m = 10
         * 7 % 10 = 7
         * 15 % 10 = 5
         * 33 % 10 = 3
         */
    }

    public static void insertaHash(Hash[] h, int m, int n) {
        boolean i = false;
        int j = FuncionHash(n, m);
        do {
            if (h[j].estado == 0 || h[j].estado == 1) {
                h[j].dato = n;
                h[j].estado = 2;
                i = true;
            } else {
                j++;
            }
        } while (j < m && !i);
        if (i) {
            System.out.print("Elemento insertado con Éxito! \n");
        } else {
            System.out.print("Tabla llena! \n");
        }
    }

    public static int buscaHash(Hash[] h, int m, int n) {
        /**  
         * h: tabla hash
         * m: tamaño de la tabla
         * n: valor buscado
         * debe devolver el valor mismo que busca (n) si lo encuentra, y -1 si no
         */

        /**
         * Para saber si el dato 'n' se encuentra en la tabla 'h', usamos FuncionHash para
         * saber en qué índice de la tabla debería estar, y lo buscamos allí.
         * Si el dato presente en ese índice coincide con 'n', la búsqueda fue exitosa.
         */
        if (h[FuncionHash(n, m)].dato == n) {
            /**
             * Acorde al enunciado, en caso de encontrar 'n' debemos devolver el mismo 'n', es decir:
             * return h[FuncionHash(n, m)].dato;
             * o bien:
             * return n;
             * 
             * El problema es que la función eliminaHash utiliza el resultado de buscaHash 
             * como índice para eliminar elementos, por ende a fin de que el programa compile 
             * retornaremos dicho índice.
             */ 
            return FuncionHash(n, m);
        } else {
            // Si no hubo match en la comparación, retornamos -1
            return -1;
        }
    }

    public static int eliminaHash(Hash[] h, int m, int n) {
        int i = buscaHash(h, m, n);
        if (i == -1) {
            return -1;
        } else {
            h[i].estado = 1;
            System.out.print("Elemento Borrado \n");
            return 1;
        }
    }
}