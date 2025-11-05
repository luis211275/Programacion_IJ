package Juego_sencillo;

import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Personajes pj1 = new Personajes("GUERRERO", 80, 35, 25);
            Personajes pj2 = new Personajes("MAGO", 65, 55, 25);
            System.out.println("LA GRAN BATALLA");
            Thread.sleep(1000);
            System.out.println("Hola jugadores, bienvenido a esta gran batalla entre Guerreros y Magos, aquí se decidirá quien es el que manda en el reino");
            Thread.sleep(3000);
            System.out.println("El personaje 1 serán los guerreros y el personaje 2 serán los magos");
            Thread.sleep(2000);
            System.out.println("Etas son las estadisticas de los dos personajes: ");
            Thread.sleep(1000);
            System.out.println(pj1.toString());
            Thread.sleep(3000);
            System.out.println(pj2.toString());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
