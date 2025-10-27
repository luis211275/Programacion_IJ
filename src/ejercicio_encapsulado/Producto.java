package ejercicio_encapsulado;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

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
    //calcular valor inventario precio * cantidad stock
    public void inventario (){

    }


    public void MostrarInfomracion(){
        System.out.println("Producto: " + this.nombre + "Precio: " + this.precio);

    }
    //en la clasde main, crear un producto, mostrar los atributos calcular y mostrar el valor del inventario
}

