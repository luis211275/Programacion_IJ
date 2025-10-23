public class Coche1 {
    private String marca;
    private String modelo;
    private int velocidad;
    //CONSTRUCTOR

    public Coche1(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
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
    //ACELERAR
    public void acelerar(int incremento){
        velocidad+=incremento;
        System.out.println("El coche acelerará: "+incremento);
    }
    public void frenar(){
        velocidad=0;
        System.out.println("El coche ha frenado");
    }
    public void MostrarEstado(){
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("velocidad: " + velocidad);
        System.out.println("------------------------------");
    }
}
