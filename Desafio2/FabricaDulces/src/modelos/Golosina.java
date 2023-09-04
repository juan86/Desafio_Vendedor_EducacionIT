package modelos;

public abstract class Golosina {
    private int codigo;
    private String nombre;
    private double precio;
    private String ingredientes;

    public Golosina(int codigo, String nombre, double precio, String ingredientes) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    @Override
    public String toString() {
        return  "\tCodigo: " + codigo + "\n"+
                "\tNombre: " + nombre + "\n"+
                "\tPrecio: " + precio + "\n"+
                "\tIngredientes: " + ingredientes;
    }
}
