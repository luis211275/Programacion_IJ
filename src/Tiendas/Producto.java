package Tiendas;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;


    //CONSTRUCTOR
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    //GETTERS AND SETTERS


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //METODO PARA REDUCIR EL STOCK
    public boolean reducirStock(int cantidad) {

        if (cantidad <= 0){
            System.out.println("Cantidad invalida");
            return false;
        }

        if (cantidad > this.stock) {
            System.out.println("No hay suficiente Stock");
            return false;
        }
        this.stock -= cantidad;
        return true;
    }

    //MOSTRAR INFORMACION
    public void MostrarInformacion() {
        System.out.println("Producto: " + this.nombre);
        System.out.println("Precio: " + this.precio + "$");
        System.out.println("Stock: " + this.stock);
    }


}
