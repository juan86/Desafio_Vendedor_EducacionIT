package modelos;

public class Chocolate extends Golosina {
    private TipoChocolate tipoChocolate;

    public Chocolate(int codigo, String nombre, double precio, String ingredientes, TipoChocolate tipoChocolate) {
        super(codigo, nombre, precio, ingredientes);
        this.tipoChocolate = tipoChocolate;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "\t"+"Tipo Chocolate: " + tipoChocolate;
    }
}
