package modelos;

public class CarameloConRelleno extends Golosina {
    private String saborRelleno;
    private double cantidaRelleno;

    public CarameloConRelleno(int codigo, String nombre, double precio, String ingredientes, String saborRelleno, double cantidaRelleno) {
        super(codigo, nombre, precio, ingredientes);
        this.saborRelleno = saborRelleno;
        this.cantidaRelleno = cantidaRelleno;
    }

    public String getSaborRelleno() {
        return saborRelleno;
    }

    public double getCantidaRelleno() {
        return cantidaRelleno;
    }

    @Override
    public String toString(){
        return super.toString()+"\n"+
                "\tSabor Relleno: "+saborRelleno+"\n"+
                "\tCantidad Relleno: "+cantidaRelleno;
    }
}
