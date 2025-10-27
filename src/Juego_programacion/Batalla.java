package Juego_programacion;

public class Batalla {
    int vida_guerrero;
    int ataque_guerrero;
    int defensa_guerrero;
    int vida_mago;
    int ataque_mago;
    int defensa_mago;
    int vida_arquero;
    int ataque_arquero;
    int defensa_arquero;

    public Batalla(int vida_guerrero, int ataque_guerrero, int defensa_guerrero) {
        this.vida_guerrero = vida_guerrero;
        this.ataque_guerrero = ataque_guerrero;
        this.defensa_guerrero = defensa_guerrero;
        this.vida_mago = vida_mago;
        this.ataque_mago = ataque_mago;
        this.defensa_mago = defensa_mago;
        this.vida_arquero = vida_arquero;
        this.ataque_arquero = ataque_arquero;
        this.defensa_arquero = defensa_arquero;

    }


    public int getVida_guerrero() {
        return vida_guerrero;
    }

    public void setVida_guerrero(int vida_guerrero) {
        this.vida_guerrero = vida_guerrero;
    }

    public int getAtaque_guerrero() {
        return ataque_guerrero;
    }

    public void setAtaque_guerrero(int ataque_guerrero) {
        this.ataque_guerrero = ataque_guerrero;
    }

    public int getDefensa_guerrero() {
        return defensa_guerrero;
    }

    public void setDefensa_guerrero(int defensa_guerrero) {
        this.defensa_guerrero = defensa_guerrero;
    }

    public int getVida_mago() {
        return vida_mago;
    }

    public void setVida_mago(int vida_mago) {
        this.vida_mago = vida_mago;
    }

    public int getAtaque_mago() {
        return ataque_mago;
    }

    public void setAtaque_mago(int ataque_mago) {
        this.ataque_mago = ataque_mago;
    }

    public int getDefensa_mago() {
        return defensa_mago;
    }

    public void setDefensa_mago(int defensa_mago) {
        this.defensa_mago = defensa_mago;
    }

    public int getVida_arquero() {
        return vida_arquero;
    }

    public void setVida_arquero(int vida_arquero) {
        this.vida_arquero = vida_arquero;
    }

    public int getAtaque_arquero() {
        return ataque_arquero;
    }

    public void setAtaque_arquero(int ataque_arquero) {
        this.ataque_arquero = ataque_arquero;
    }

    public int getDefensa_arquero() {
        return defensa_arquero;
    }

    public void setDefensa_arquero(int defensa_arquero) {
        this.defensa_arquero = defensa_arquero;
    }
    public void ataque (int ataque){
        this.ataque_guerrero += ataque;
    }
}
