package ejercicio1;

public class Cotizacion {
    private long id;
    private String fechaYHora;
    private Vendedor vendedor;
    private Prenda prenda;
    private int cantidad;
    private double resultadoTotal;

    public Cotizacion(long id, String fechaYHora, Vendedor vendedor, Prenda prenda, int cantidad, double resultadoTotal) {
        this.id = id;
        this.fechaYHora = fechaYHora;
        this.vendedor = vendedor;
        this.prenda = prenda;
        this.cantidad = cantidad;
        this.resultadoTotal = resultadoTotal;
    }

    public long getId() {
        return id;
    }

    public String getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(String fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Prenda getPrendaCotizada() {
        return prenda;
    }

    public void setPrenda(Prenda prenda) {
        this.prenda = prenda;
    }

    public int getCantidadUnidades() {
        return cantidad;
    }

    public void setCantidadUnidades(int cantidadUnidades) {
        this.cantidad = cantidadUnidades;
    }

    public double getResultadoTotal() {
        return resultadoTotal;
    }

    public void setResultadoTotal(double resultadoTotal) {
        this.resultadoTotal = resultadoTotal;
    }

    @Override
    public String toString() {
        return "\tid: "+id+"\n" +
               "\tFechaYHora: "+fechaYHora+"\n"+
                "\tVendedor: "+vendedor+"\n"+
                "\tPrenda: " +prenda+"\n"+
                "\tCantidad: "+cantidad+"\n"+
                "\tTotal: "+resultadoTotal;
    }
}
