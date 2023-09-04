package modelos;

import modelos.bonus.NewPedido;

import java.util.ArrayList;
import java.util.List;

public class GestorPedidos {
    private List<Pedido> pedidos;

    public GestorPedidos(){
        pedidos = new ArrayList<>();
    }

    public void agregarPedido(Pedido pedido){
        pedidos.add(pedido);
    }

    public String listarPedidos(){
        if(pedidos.isEmpty()) return "No hay pedidos cargados";
        String listaPedidos = "";
        for (Pedido pedido : pedidos){
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
