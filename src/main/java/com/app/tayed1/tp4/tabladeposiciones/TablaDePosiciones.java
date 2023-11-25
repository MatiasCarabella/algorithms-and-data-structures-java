package main.java.com.app.tayed1.tp4.tabladeposiciones;

import java.util.Arrays;
import main.java.com.app.tayed1.tp4.equipo.Equipo;
import main.java.com.app.tayed1.tp4.quicksort.QuickSort;

public class TablaDePosiciones {
    private Equipo[] equipos;

    public TablaDePosiciones() {
        this.equipos = new Equipo[0];
    }

    public void agregarEquipo(Equipo equipo) {
        System.out.println("Insertando equipo '" + equipo.nombre + "', pts: " + equipo.puntos);
        equipos = Arrays.copyOf(equipos, equipos.length + 1);
        equipos[equipos.length - 1] = equipo;

        // Aplicar el algoritmo Quicksort
        QuickSort.ordenar(equipos);
    }

    public void mostrarTabla() {
        int i = 1;
        for (Equipo equipo : equipos) {
            System.out.println(i + ". " + equipo.nombre + " - Pts: " + equipo.puntos);
            i++;
        }
    }
}
