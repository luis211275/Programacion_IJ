package Tiendas;
import java.util.Scanner;
public class TiendaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Producto producto = new Producto("mesa", 50, 10);
        Producto producto2 = new Producto("silla", 20, 15);
        Producto producto3 = new Producto("nevera", 100, 2);
        Cliente cliente = new Cliente("Luis", 200);


        cliente.MostrarInformacion();
        producto.MostrarInformacion();
        producto2.MostrarInformacion();
        producto3.MostrarInformacion();





        System.out.println("¿que producto quieres comprar (1-mesa; 2-silla; 3-nevera)?");
        int eleccion = sc.nextInt();

        System.out.println("¿Cuantos quieres comprar?");
        int cantidad = sc.nextInt();


        if (eleccion == 1){
            cliente.Comprar(producto, cantidad);
            cliente.MostrarInformacion();
        }else if (eleccion == 2){
            cliente.Comprar(producto2, cantidad);
            cliente.MostrarInformacion();
        }else if (eleccion == 3){
            cliente.Comprar(producto3, cantidad);
            cliente.MostrarInformacion();

        }else {
            System.out.println("Opcion no valida");
        }

        System.out.println("====Resultados despues de la compra====");
        cliente.MostrarInformacion();
        producto.MostrarInformacion();
        producto2.MostrarInformacion();
        producto3.MostrarInformacion();


        System.out.println("=====DEGUNDA COMPRA=====");

        System.out.println("¿que producto quieres comprar (1-mesa; 2-silla; 3-nevera)?");
        int eleccion1 = sc.nextInt();

        System.out.println("¿Cuantos quieres comprar?");
        int cantidad1 = sc.nextInt();


        if (eleccion1 == 1){
            cliente.Comprar(producto, cantidad1);
            cliente.MostrarInformacion();
        }else if (eleccion1 == 2){
            cliente.Comprar(producto2, cantidad1);
            cliente.MostrarInformacion();
        }else if (eleccion1 == 3){
            cliente.Comprar(producto3, cantidad1);
            cliente.MostrarInformacion();

        }else {
            System.out.println("Opcion no valida");
        }

        System.out.println("====Resultados despues de la compra====");
        cliente.MostrarInformacion();
        producto.MostrarInformacion();
        producto2.MostrarInformacion();
        producto3.MostrarInformacion();

    }
}
