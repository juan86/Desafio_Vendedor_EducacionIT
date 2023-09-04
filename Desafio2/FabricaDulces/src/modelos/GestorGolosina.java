package modelos;

import java.util.ArrayList;
import java.util.List;

public class GestorGolosina {
    private List<Golosina> listaDeGolosina;

    public GestorGolosina(){
        listaDeGolosina = new ArrayList<>();
    }

    public void agregarGolisna(Golosina golosina){
        listaDeGolosina.add(golosina);
    }

    public String listarGolosinas(){
        if(listaDeGolosina.isEmpty()) return "No hay golosinas cargadas";
        String listaGolosinas = "";
        for (Golosina golosina : listaDeGolosina){
            listaGolosinas += golosina.toString() + "\n";
        }
        listaGolosinas += "Cantidad de Golosinas : "+cantidadDeGolosinas()+"\n";
        return listaGolosinas;
    }

    public int cantidadDeGolosinas(){
        return listaDeGolosina.size();
    }
}
