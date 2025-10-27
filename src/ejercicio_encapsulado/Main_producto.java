package ejercicio_encapsulado;

public class Main_producto {
    public static void main(String[] args) {
        Producto producto = new Producto("pantalon", 20);
        producto.MostrarInfomracion();
        producto.setPrecio(40);
        producto.MostrarInfomracion();
    }
}
