public class Coches {

    private String coche;
    private String modelo;
    private int cc;
    private int Velocidad;


    public Coches(String coche, String marca, int cc, int velocidad) {
        this.coche = coche;
        this.modelo = marca;
        this.cc = cc;
        this.Velocidad = velocidad;
    }

    public String getCoche() {
        return coche;
    }

    public void setCoche(String coche) {
        this.coche = coche;
    }
        public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int velocidad) {
        Velocidad = velocidad;
    }

    public void acelerar(int aceleracion){
        int acelerado= this.Velocidad+=aceleracion;
        setVelocidad(acelerado);
    }
    public void frenar (int frenacion){
        int frenado= this.Velocidad-=frenacion;
        setVelocidad(frenado);
    }
}
