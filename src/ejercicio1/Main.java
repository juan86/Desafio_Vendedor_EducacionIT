package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static boolean correrPrograma = true;
    private static List<Vendedor> listaVendedores = new ArrayList<>();
    private static List<Prenda> listaPrendas = new ArrayList<>();
    private static Cotizador cotizador = new Cotizador();
    public static void main(String[] args) {
        cargarVendedores();
        cargarPrendas();
        seleccionarVendedor();
        input.close();
        System.out.println("Fin del programa");
    }

    public static void cargarVendedores(){
        listaVendedores.add(new Vendedor("VEN001", "Juan", "Prueba1"));
        listaVendedores.add(new Vendedor("VEN002", "Esteban", "Prueba2"));
        listaVendedores.add(new Vendedor("VEN003", "Sebastian", "Prueba3"));
    }

    public static void cargarPrendas(){
        listaPrendas.add(new Prenda("Remera", 5_000.0));
        listaPrendas.add(new Prenda("Camisa", 10_000.0));
        listaPrendas.add(new Prenda("Jean", 15_000.0));
        listaPrendas.add(new Prenda("Boxer", 1_000.0));
    }
    public static void seleccionarVendedor(){
        boolean salir = false;
        do{
            System.out.println("╔=========================================================╗");
            System.out.println("║        Bienvenido al Cotizador del ejercicio 1          ║");
            System.out.println("╠=========================================================╣");
            System.out.println("║ Seleccione ID del Vendedor.                             ║");
            System.out.println("╚=========================================================╝");
            for (int i = 0; i < listaVendedores.size(); i++) {
                System.out.println(" "+(i+1)+". "+listaVendedores.get(i).getId());
            }
            System.out.println(" 0. Salir.");
            System.out.print("Elija un Vendedor: ");
            int opcionSeleccionada = input.nextInt();
            if(opcionSeleccionada == 0){
                return;
            }
            // Validando que el vendedor sea valido
            if (opcionSeleccionada >= 1 && opcionSeleccionada <= listaVendedores.size()) {
                pantallaOpcionesVendedor(listaVendedores.get(opcionSeleccionada-1));
            }else {
                System.out.println("No se encuentra el vendedor ingresado");
            }

        }while (!salir);

    }

    public static void pantallaOpcionesVendedor(Vendedor vendedor){
        boolean salir = false;
        do{
            System.out.println("╔=========================================================╗");
            System.out.println("║               Selecciones una opcion                    ║");
            System.out.println("╠=========================================================╣");
            System.out.println("║                                                         ║");
            System.out.println("║ 1. Crear cotizacion.                                    ║");
            System.out.println("║ 2. Listar Cotizaciones             .                    ║");
            System.out.println("║ 3. Salir.                                               ║");
            System.out.println("║                                                         ║");
            System.out.println("║ Ingrese el numero de la opcion para continuar.          ║");
            System.out.println("║                                                         ║");
            System.out.println("╚=========================================================╝");
            System.out.print("Opcion: ");
            int opcionSeleccionada = input.nextInt();
            switch (opcionSeleccionada){
                case 1:
                    pantallaDeCotizacion(vendedor);
                    break;
                case 2:
                    listaCotizaciones(vendedor);
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Valor invalido...");
            }
        }while (!salir);
    }

    public static void pantallaDeCotizacion(Vendedor vendedor) {
        boolean salir = false;
        do {
            System.out.println("╔=========================================================╗");
            System.out.println("║                   Seleccione Prenda                     ║");
            System.out.println("╚=========================================================╝");
            System.out.println(" ");
            System.out.println("Vendedor: "+vendedor.getApellido()+" "+vendedor.getApellido());
            System.out.println(" ");
            for (int i = 0; i < listaPrendas.size(); i++) {
                System.out.println(" "+(i+1)+". "+listaPrendas.get(i).getNombre());
            }
            System.out.println("  0. Salir.");
            System.out.print("Elija una prenda: ");
            int opcionSeleccionada = input.nextInt();

            if(opcionSeleccionada == 0){
                return;
            }

            if (opcionSeleccionada >= 1 && opcionSeleccionada <= listaPrendas.size()) {
                System.out.print("Ingrese la cantidad: ");
                Prenda prendaSeleccionada = listaPrendas.get((opcionSeleccionada -1));
                int cantidadDePrendas = input.nextInt();
                cotizador.crearCotizacion(vendedor, prendaSeleccionada, cantidadDePrendas);
            }else{
                System.out.println("No se selecciono una prenda valida");
            }

        } while (!salir);

    }

    public static void listaCotizaciones(Vendedor vendedor){
        System.out.println("╔=========================================================╗");
        System.out.println("║                        Cotizaciones                     ║");
        System.out.println("╚=========================================================╝");
        List<Cotizacion> historialCpotizaciones = cotizador.getHistorialPorVendedor(vendedor);
        for (Cotizacion cotizacion : historialCpotizaciones){
            System.out.println(cotizacion);
        }
    }

}