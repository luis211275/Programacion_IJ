package Juego_programacion;

public class Batalla {
    private int vida_arquero;
    private int ataque_arquero;
    private int defensa_arquero;
    private int vida_guerrero;
    private int ataque_guerrero;
    private int defensa_guerrero;
    private int vida_mago;
    private int ataque_mago;
    private int defensa_mago;

    public Batalla(int vida_arquero, int ataque_arquero, int defensa_arquero, int vida_guerrero, int ataque_guerrero, int defensa_guerrero, int vida_mago, int ataque_mago, int defensa_mago) {
        this.vida_arquero = vida_arquero;
        this.ataque_arquero = ataque_arquero;
        this.defensa_arquero = defensa_arquero;
        this.vida_guerrero = vida_guerrero;
        this.ataque_guerrero = ataque_guerrero;
        this.defensa_guerrero = defensa_guerrero;
        this.vida_mago = vida_mago;
        this.ataque_mago = ataque_mago;
        this.defensa_mago = defensa_mago;
    }
}
