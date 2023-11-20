package main.java.com.app.tayed1.tp3.producto;

public class Producto {
    public int codigo;
    public String descripcion;
    public double precio;

    public Producto(int codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public void mostrar() {
        System.out.println("Código: " + codigo + ", Descripción: " + descripcion + ", Precio: " + precio);
    }
}
