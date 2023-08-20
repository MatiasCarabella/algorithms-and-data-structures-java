package main.java.com.app.tp1.edificio;

import java.util.Random;

import main.java.com.app.tp1.oficina.Oficina;

public class Edificio {
    private int pisos = 10;
    private int oficinasPorPiso = 9;
    private int hallAscensores = 5;

    public boolean obtenerSensor(int piso, int oficina) throws Exception{
        if (piso < 1 || piso > this.pisos || oficina < 1 || oficina > oficinasPorPiso) {
            throw new Exception("Combinación de piso/oficina inválida (" + piso + "," + oficina + ") - No hay sensor");
        }
        return new Random().nextBoolean();
    }

    public int cantidadOficinasActivas() throws Exception {
        int oficinasActivas = 0;
        /**
         * Comenzamos la iteración desde el piso uno, pues en la planta baja no hay oficinas/sensores.
         * Este primer for irá desde el piso 1 hasta el piso 10 inclusive, el cual tenemos almacenado en el atributo 'pisos'
         */
        for (int piso = 1; piso <= this.pisos; piso++) {
            /**
             * Cada piso tiene a su vez oficinas, numeradas del 1 al 9, con una excepción:
             * El #5 se corresponde con el hall de ascensores, lo cual no es una oficina por lo cual se estará omitiendo.
             */
            for (int oficina = 1; oficina <= this.oficinasPorPiso; oficina++) {
                // Obviamos el hall de ascensores
                if (oficina == this.hallAscensores) {
                    continue;
                }
                // Validamos el estado del sensor, y aumentamos el contador en caso de que esté activo
                if (obtenerSensor(piso, oficina)) {
                    oficinasActivas++;
                }
            }
        }
        return oficinasActivas;
    }

    public Oficina encontrarPrimeraOficinaActiva() throws Exception {
        /**
         * Comenzamos la iteración desde el piso uno, pues en la planta baja no hay oficinas/sensores.
         * Este primer for irá desde el piso 1 hasta el piso 10 inclusive, el cual tenemos almacenado en el atributo 'pisos'
         */
        for (int piso = 1; piso <= this.pisos; piso++) {
            /**
             * Cada piso tiene a su vez oficinas, numeradas del 1 al 9, con una excepción:
             * El #5 se corresponde con el hall de ascensores, lo cual no es una oficina por lo cual se estará omitiendo.
             */
            for (int oficina = 1; oficina <= this.oficinasPorPiso; oficina++) {
                // Obviamos el hall de ascensores
                if (oficina == this.hallAscensores) {
                    continue;
                }
                // Validamos el estado del sensor, y retornamos la oficina si está activo
                if (obtenerSensor(piso, oficina)) {
                    return new Oficina(oficina, piso);
                }
            }
        }
        // Si terminamos la iteración sin haber encontrado oficinas activas, retornamos null
        return null;
    }
}
