package main.java.com.app.tp1.oficina;

public class Oficina {
    private int nro;
    private int piso;

    public Oficina(int nro, int piso) {
        this.nro = nro;
        this.piso = piso;
    }

    public String toString() {
        return "Oficina [nro=" + nro + ", piso=" + piso + "]";
    }
}
