package Juego_programacion;

public class Personajes {
    private String nombre_guerrero;
    private int nivel_guerrero;
    private int vida_guerrero;
    private int ataque_guerrero;
    private int defensa_guerrero;
    private String nombre_mago;
    private int nivel_mago;
    private int vida_mago;
    private int ataque_mago;
    private int defensa_mago;
    private String nombre_arquero;
    private int nivel_arquero;
    private int vida_arquero;
    private int ataque_arquero;
    private int defensa_arquero;
    
    public Personajes(String nombre_guerrero, String nombre_mago, String nombre_arquero, int nivel_guerrero, int nivel_mago, int nivel_arquero, int vida_guerrero, int vida_mago, int vida_arquero, int ataque_guerrero, int ataque_mago, int ataque_arquero, int defensa_guerrero, int defensa_mago, int defensa_arquero) {
        this.nombre_guerrero = nombre_guerrero;
        this.nivel_guerrero = 0;
        this.vida_guerrero = 80;
        this.ataque_guerrero = 35;
        this.defensa_guerrero = 25;
        this.nombre_mago = nombre_mago;
        this.nivel_mago = 0;
        this.vida_mago = 65;
        this.ataque_mago = 55;
        this.defensa_mago = 20;
        this.nombre_arquero = nombre_arquero;
        this.nivel_arquero = 0;
        this.vida_arquero = 70;
        this.ataque_arquero = 45;
        this.defensa_arquero = 25;
    }
    @Override
    public String toString() {
        return "EL GUERRERO:  {" +
                ", nombre_guerrero= '" + nombre_guerrero + '\'' +
                ", nivel_guerrero= " + nivel_guerrero +
                ", vida_guerrero= " + vida_guerrero +
                ", ataque_guerrero= " + ataque_guerrero +
                " defensa_guerrero= " + defensa_guerrero +
                '}';
    }

    public String toString2() {
        return "EL MAGO:   {" +
                ", nombre_mago= '" + nombre_mago + '\'' +
                ", nivel_mago= " + nivel_mago +
                ", vida_mago= " + vida_mago +
                ", ataque_mago= " + ataque_mago +
                "defensa_mago= " + defensa_mago +
                '}';
    }

    public String toString3() {
        return "EL ARQUERO:   {" +
                ", nombre_arquero=' " + nombre_arquero + '\'' +
                ", nivel_arquero= " + nivel_arquero +
                ", vida_arquero= " + vida_arquero +
                ", ataque_arquero= " + ataque_arquero +
                " defensa_arquero= " + defensa_arquero +
                '}';
    }

}


