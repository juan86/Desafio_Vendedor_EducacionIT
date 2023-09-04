package ejercicio1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Cotizador {
    private List<Cotizacion> cotizaciones;
    private long idCotizaciones;

    public Cotizador() {
        cotizaciones = new ArrayList<>();
        idCotizaciones = 1;
    }

    private void cargarCotizacion(Cotizacion cotizacion){
        cotizaciones.add(cotizacion);
    }

    public List<Cotizacion> getHistorialPorVendedor(Vendedor vendedor){
        List<Cotizacion> listaCotizacionDelVendedor = new ArrayList<>();
        for(Cotizacion cotizacion : cotizaciones){
            if(cotizacion.getVendedor().getId() == vendedor.getId()){
                listaCotizacionDelVendedor.add(cotizacion);
            }
        }
        return listaCotizacionDelVendedor;
    }

    public void crearCotizacion(Vendedor vendedor, Prenda prenda, int cantidad) {
        // Generar la fecha y hora
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fechaYHoraFormateado = time.format(formatter);

        double totalDeLaCotizacion = prenda.getPrecio() * cantidad;

        Cotizacion cotizacion = new Cotizacion(idCotizaciones, fechaYHoraFormateado, vendedor, prenda, cantidad, totalDeLaCotizacion);
        cotizaciones.add(cotizacion);
        idCotizaciones++;

        System.out.println("Cotizacion cargada: \n" + cotizacion);
    }

    public void elimnarCotizacion(int id){
        boolean elimnado = false;

        if (cotizaciones.isEmpty()) return;

        int iterador = 0;

        while(!elimnado){
            Cotizacion cotizacion = cotizaciones.get(iterador);
            if(cotizacion.getId() == id){
                elimnado = true;
            }
            iterador++;
        }
    }
}
