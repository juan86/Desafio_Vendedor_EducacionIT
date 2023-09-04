package ejercicio1;

public class Vendedor {
    private String id;
    private String nombre;
    private String apellido;

    public Vendedor(String id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString(){
        return id+", "+nombre+", "+apellido;
    }
}
