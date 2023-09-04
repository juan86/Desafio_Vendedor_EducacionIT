package modelos;

public class CarameloSinRelleno extends Golosina {
    private String sabor;
    private String color;
    public CarameloSinRelleno(int codigo, String nombre, double precio, String ingredientes, String sabor, String color) {
        super(codigo, nombre, precio, ingredientes);
        this.sabor = sabor;
        this.color = color;
    }

    public String getSabor() {
        return sabor;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString(){
        return super.toString()+"\n"+
                "\tSabor: "+sabor+"\n"+
                "\tColor: "+color;
    }
}
