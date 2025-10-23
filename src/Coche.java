public class Coche {
    private String marca;
    private String modelo;
    private int velocidad;
    //CONSTRUCTOR
    public Coche(String marca, String modelo, int velocidad){
        this.marca=marca;
        this.modelo=modelo;
        this.velocidad=velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    //metodo para acelerar
    public void Acelerar(int incremento){
        velocidad+= incremento;
        System.out.println("El coche acelera " + incremento + " km/h");
    }
    public void Frenar (){
        velocidad = 0;
        System.out.println("el coche ha frenado");
    }
    public void mostrarEstado() {
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("velocidad: " + velocidad);
        System.out.println("------------------------------");
    }
    public static void main(String[] args) {
        Coche MiCoche = new
                Coche("Toyota", "Yaris", 40);

        //Cambio el estado inicial
        MiCoche.mostrarEstado();

        //acelero el coche
        MiCoche.Acelerar(40);
        MiCoche.mostrarEstado();

        //freno el coche
        MiCoche.Frenar();
        MiCoche.mostrarEstado();

    }
}