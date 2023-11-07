package main.java.com.app.tayed1.tp2.pedido;

public class Pedido {
    private int codigo;             // Código numérico del pedido
    private String nombreCliente;   // Nombre del cliente que realizó el pedido
    private int cantidadLadrillos;   // Cantidad de ladrillos en el pedido

    public Pedido(int codigo, String nombreCliente, int cantidadLadrillos) {
        this.codigo = codigo;
        this.nombreCliente = nombreCliente;
        this.cantidadLadrillos = cantidadLadrillos;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public int getCantidadLadrillos() {
        return cantidadLadrillos;
    }
}