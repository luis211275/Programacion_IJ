import java.util.Scanner;
public class MainCoche {
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