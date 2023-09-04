package modelos;

public class Pedido {
    private int nroPedido;
    private Golosina golosina;
    private int cantidad;

    public Pedido(int nroPedido, Golosina golosina, int cantidad) {
        this.nroPedido = nroPedido;
        this.golosina = golosina;
        this.cantidad = cantidad;
    }

    public int getNroPedido() {
        return nroPedido;
    }

    public Golosina getGolosina() {
        return golosina;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double precioPedido(){
        return (golosina != null) ? cantidad * golosina.getPrecio() : .0;
    }

    @Override
    public String toString() {
        return "Pedido Nro: "+nroPedido+"\n"+
                "\tGolosina: "+golosina+"\n"+
                "\tCantidad: "+cantidad;
    }
}
