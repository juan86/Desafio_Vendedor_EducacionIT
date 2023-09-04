import modelos.*;
import modelos.bonus.NewPedido;
import modelos.bonus.NewGestorPedidos;

public class Main {
    public static void main(String[] args) {
        //primeraParteDesafio();
        bonusDesafio();
    }

    public static void primeraParteDesafio(){
        GestorGolosina gestorGolosinas = new GestorGolosina();

        Golosina chocolateBlanco = new Chocolate(100, "Chocolate Blanco", 150.0, "Cacao, manteca, azucar", TipoChocolate.BLANCO);
        Golosina chocolateNegro = new Chocolate(200, "Chocolate Blanco", 150.0, "Cacao 100%, azucar", TipoChocolate.NEGRO);
        Golosina carameloSinRelleno = new CarameloSinRelleno(300, "Menta cristal", 10.0, "menta, azucar", "Menta", "Cristal");
        Golosina carameloConRelleno = new CarameloConRelleno(400, "Menta con Chocolate", 20.0, "Menta, cacao, azucar", "Chocolate", 1.5);

        gestorGolosinas.agregarGolisna(chocolateBlanco);
        gestorGolosinas.agregarGolisna(chocolateNegro);
        gestorGolosinas.agregarGolisna(carameloSinRelleno);
        gestorGolosinas.agregarGolisna(carameloConRelleno);


        System.out.println(gestorGolosinas.listarGolosinas());
    }

    public static void bonusDesafio(){
        NewGestorPedidos gestorPedidos = new NewGestorPedidos();
        Golosina chocolateBlanco = new Chocolate(100, "Chocolate Blanco", 150.0, "Cacao, manteca, azucar", TipoChocolate.BLANCO);
        Golosina chocolateNegro = new Chocolate(200, "Chocolate Blanco", 150.0, "Cacao 100%, azucar", TipoChocolate.NEGRO);
        Golosina carameloSinRelleno = new CarameloSinRelleno(300, "Menta cristal", 10.0, "menta, azucar", "Menta", "Cristal");
        Golosina carameloConRelleno = new CarameloConRelleno(400, "Menta con Chocolate", 20.0, "Menta, cacao, azucar", "Chocolate", 1.5);

        NewPedido pedido = new NewPedido(1000);
        pedido.agregarGolosina(chocolateBlanco);
        pedido.agregarGolosina(chocolateNegro);
        pedido.agregarGolosina(carameloSinRelleno);
        pedido.agregarGolosina(carameloConRelleno);
        pedido.agregarGolosina(carameloConRelleno);

        gestorPedidos.agregarPedido(pedido);

        System.out.println(gestorPedidos.listarPedidos());
    }
}