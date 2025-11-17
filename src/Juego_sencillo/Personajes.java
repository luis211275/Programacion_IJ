package Juego_sencillo;

public class Personajes {
    private String nombre;
    private int vida;
    private int ataque;
    private int defensa;


    public Personajes(String nombre, int vida, int ataque, int defensa) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public Personajes(int vida, int ataque, int defensa) {
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreGuerrero) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }


    public int ataque_especial() {
        return ataque * 2;
    }



    @Override
    public String toString() {
        return "Personajes{" +
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                ", ataque especial=" +  ataque_especial() +
                '}';
    }
}
