package modelos.bonus;

import modelos.bonus.NewPedido;

import java.util.ArrayList;
import java.util.List;

public class NewGestorPedidos {
    private List<NewPedido> pedidos;

    public NewGestorPedidos(){
        pedidos = new ArrayList<>();
    }

    public void agregarPedido(NewPedido pedido){
        pedidos.add(pedido);
    }

    public String listarPedidos(){
        if(pedidos.isEmpty()) return "No hay pedidos cargados";

        String listaPedidos = "";

        for (NewPedido pedido : pedidos){
            listaPedidos += pedido.toString();
        }

        return listaPedidos;
    }

    public void eliminarPedidoPorCodigo(int codigoPedido){
        for (int i = 0; i < pedidos.size(); i++) {
            if( pedidos.get(codigoPedido).getNroPedido() == codigoPedido){
                pedidos.remove(codigoPedido);
            }
        }
    }

}
