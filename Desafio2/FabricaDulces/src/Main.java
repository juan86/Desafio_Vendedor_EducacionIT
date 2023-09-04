import modelos.*;

public class Main {
    public static void main(String[] args) {
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
}