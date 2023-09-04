package ejercicio1;

public class Prenda {
    private String nombre;
    private double precio;

    public Prenda(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+", precio: "+precio;
    }
}
