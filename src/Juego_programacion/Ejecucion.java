package Juego_programacion;

import java.util.Random;
import java.util.Scanner;


public class Ejecucion {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Random random = new Random();
            Personajes personajes = new Personajes(
                    "Guerrero", "Mago", "Arquero",0,0,
                    0, 80, 65, 70, 35,
                    55, 45, 25,20,25
            );
            System.out.println("Hola soldado");
            Thread.sleep(1000);
            System.out.println("Bienvenido a este gran juego en el que te enfrentaras a grandes batallas: ");
            Thread.sleep(2000);
            System.out.println("Pero antes, debes elegir el personaje, hazlo con cabeza, por que al que los que no elijas tendras que luchar contra ellos");
            Thread.sleep(4000);
            System.out.println(personajes.toString());
            Thread.sleep(3000);
            System.out.println(personajes.toString2());
            Thread.sleep(3000);
            System.out.println(personajes.toString3());
            Thread.sleep(2000);
            boolean eleccion_valida = false;
            do {

                System.out.println("Ahora, es tu momento de elegir a tu luchador");
                System.out.println("Si quieres que tu heroe sea el guerrero, pulsa 1. Si quieres que sea el mago pulsa 2. Si quieres que sea el arquero pulsa 3");
                int eleccion = sc.nextInt();

                if (eleccion == 1) {
                    System.out.println("Bien, has elejido al guerrero, buena idea");
                    int num_mago = 1;
                    int num_arquero = 2;
                    eleccion_valida = true;
                } else if (eleccion == 2) {
                    System.out.println("Bien, has elejido al mago, buena idea");
                    int num_guerrero = 1;
                    int num_arquero = 2;
                    eleccion_valida = true;
                } else if (eleccion == 3) {
                    System.out.println("Bien, has elejido al arquero, buena idea");
                    int num_guerrero = 1;
                    int num_mago = 2;
                    eleccion_valida = true;
                } else if (eleccion != 1 || eleccion != 2 || eleccion != 3) {
                    System.out.println("Empezamos mal soldado");
                    Thread.sleep(1000);
                    System.out.println("Debes poner un numero entre el 1 o el 3, te has equivocado");
                    Thread.sleep(1000);
                }
                if (eleccion_valida=true) {
                    System.out.println("Despues de haber elegido al eprsonaje, veamos a ver contra quien te enfrentas primero");
                    Thread.sleep(500);
                    System.out.println("Esta eleccion se hara de forma aleatoria...");
                    System.out.println("Y te enfrentaras contra...");
                    Thread.sleep(1000);
                    int pelea = random.nextInt(2) + 1;
                }
            } while (!eleccion_valida);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restaura el estado de interrupción
        }

    }

}