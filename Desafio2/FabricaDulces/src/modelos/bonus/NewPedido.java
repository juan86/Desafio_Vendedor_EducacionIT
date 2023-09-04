package modelos.bonus;

import modelos.Golosina;

import java.util.*;

public class NewPedido {
    private int nroPedido;
    private HashMap<Integer, Golosina> listaGolosinas;
    private HashMap<Integer, Integer> cantidadPorGolosina;
    public NewPedido(int nroPedido) {
        listaGolosinas = new HashMap<>();
        cantidadPorGolosina = new HashMap<>();
        this.nroPedido = nroPedido;
    }

    public void agregarGolosina(Golosina golosina){

        if(listaGolosinas.containsKey(golosina.getCodigo())){
            int cantidad = cantidadPorGolosina.get(golosina.getCodigo());
            cantidad++;
            cantidadPorGolosina.replace(golosina.getCodigo(), cantidad);
        }else {
            listaGolosinas.put(golosina.getCodigo(), golosina);
            cantidadPorGolosina.put(golosina.getCodigo(), 1);
        }
    }

    private String listaGolosinas(){

        if(listaGolosinas.isEmpty()) return "\t\tNo hay golosinas cargadas";
        Iterator<Map.Entry<Integer, Golosina>> iterator = listaGolosinas.entrySet().iterator();

        int contador = 1;
        String listaToString = "";
        while (iterator.hasNext()) {
            Map.Entry<Integer, Golosina> itemGolosina = iterator.next();
            Golosina golosina = itemGolosina.getValue();
            listaToString += contador+". \n"+golosina.toString()+"\n"+"\tCantidad: "+cantidadPorGolosina.get(golosina.getCodigo())+"\n";
            contador++;
        }

        return listaToString;
    }

    public double getPrecioPedido(){
        double total = .0;
        Iterator<Map.Entry<Integer, Golosina>> iterator = listaGolosinas.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, Golosina> itemGolosina = iterator.next();
            Golosina golosina = itemGolosina.getValue();
            int cantidad = cantidadPorGolosina.get(golosina.getCodigo());
            total += golosina.getPrecio() * cantidad;
        }
        return total;

    }

    public int getNroPedido(){
        return nroPedido;
    }

    @Override
    public String toString() {
        return "Pedido Nro: "+nroPedido+"\n"+
                "Golosinas: \n"+
                listaGolosinas()+"\n"+
                "Total: "+getPrecioPedido()+"\n";
    }
}
