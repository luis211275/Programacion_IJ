package Tiendas;

public class Cliente {
    private String nombre;
    private double saldo;

    //CONSTRUCTOR

    public Cliente(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    //GUETERS AND SETTERS


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // METODO COMPRAR
    public boolean Comprar (Producto p, int cantidad) {

        if (cantidad <= 0){
            System.out.println("Cantidad invalida");
            return false;
        }

        double CosteTotal = p.getPrecio() * cantidad;

        if (CosteTotal <= this.getSaldo() && p.getStock() >= cantidad) {
            this.setSaldo(this.getSaldo() - CosteTotal);
            p.reducirStock(cantidad);

            System.out.println("Felicidades!!!, has comprado el producto");
            return true;
        }else {
            System.out.println("No puede comprar el producto");
            return false;
        }

    }

    //METODO MOSTRAR INFORMACION

    public void MostrarInformacion(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Saldo: "+ this.saldo);
    }
}
