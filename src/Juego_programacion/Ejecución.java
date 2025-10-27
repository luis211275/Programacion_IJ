package Juego_programacion;

import java.util.Random;
import java.util.Scanner;


public class Ejecución {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Random random = new Random();
            String[] nombres = {"Guerrero", "Mago", "Arquero"};
            int[] niveles = {0, 0, 0};
            Batalla guerrero = new Batalla(80, 35, 25);
            Batalla mago = new Batalla(65, 55, 20);
            Batalla arquero = new Batalla(70, 45, 25);
            System.out.println("Hola soldado");
            Thread.sleep(1000);
            System.out.println("Bienvenido a este gran juego en el que te enfrentaras a grandes batallas: ");
            Thread.sleep(2000);
            System.out.println("Pero antes, debes elegir el personaje, hazlo con cabeza, por que al que los que no elijas tendras que luchar contra ellos");
            Thread.sleep(4000);
            System.out.println("El " + nombres[0] + "\n" + "NIVEL: " + niveles[0] + "\n" + "VIDA: " + guerrero.vida_guerrero + "\n" + "ATAQUE: " + guerrero.ataque_guerrero + "\n" + "DEFENSA: " + guerrero.defensa_guerrero);
            System.out.println("------------------------------------------------------------------------------------");
            Thread.sleep(3000);
            System.out.println("El " + nombres[1] + "\n" + "NIVEL: " + niveles[1] + "\n" + "VIDA: " + mago.vida_mago + "\n" + "ATAQUE: " + mago.ataque_mago + "\n" + "DEFENSA: " + mago.defensa_mago);
            System.out.println("------------------------------------------------------------------------------------");
            Thread.sleep(3000);
            System.out.println("El " + nombres[2] + "\n" + "NIVEL: " + niveles[2] + "\n" + "VIDA: " + arquero.vida_arquero + "\n" + "ATAQUE: " + arquero.ataque_arquero + "\n" + "DEFENSA: " + arquero.defensa_arquero);
            System.out.println("------------------------------------------------------------------------------------");
            Thread.sleep(2000);
            boolean eleccion_valida = false;
            do {

                System.out.println("Ahora, es tu momento de elegir a tu luchador");
                System.out.println("Si quieres que tu heroe sea el guerrero, pulsa 1. Si quieres que sea el mago pulsa 2. Si quieres que sea el arquero pulsa 3");
                int eleccion = sc.nextInt();

                if (eleccion == 1) {
                    System.out.println("Bien, has elejido al guerrero, buena idea");
                    Thread.sleep(1000);
                    int num_mago = 1;
                    int num_arquero = 2;
                    eleccion_valida = true;
                    System.out.println("Depues de haber elegido al guerrero, vamos a ver contra quien te vas a enfrentar");
                    Thread.sleep(500);
                    System.out.println("Te enfrentaras contra...");
                    Thread.sleep(1000);
                    int pelea = random.nextInt(2) + 1;
                    if (pelea == num_mago) {
                        System.out.println("El MAGO ");
                    } else {
                        System.out.println("El ARQUERO ");
                    }
                } else if (eleccion == 2) {
                    System.out.println("Bien, has elejido al mago, buena idea");
                    Thread.sleep(1000);
                    int num_guerrero = 1;
                    int num_arquero = 2;
                    eleccion_valida = true;System.out.println("Depues de haber elegido al mago, vamos a ver contra quien te vas a enfrentar");
                    Thread.sleep(500);
                    System.out.println("Te enfrentaras contra...");
                    Thread.sleep(1000);
                    int pelea = random.nextInt(2) + 1;
                    if (pelea == num_guerrero) {
                        System.out.println("El GUERRERO");
                    } else {
                        System.out.println("El ARQUERO ");
                    }

                } else if (eleccion == 3) {
                    System.out.println("Bien, has elejido al arquero, buena idea");
                    Thread.sleep(1000);
                    int num_guerrero = 1;
                    int num_mago = 2;
                    eleccion_valida = true;
                    System.out.println("Depues de haber elegido al mago, vamos a ver contra quien te vas a enfrentar");
                    Thread.sleep(500);
                    System.out.println("Te enfrentaras contra...");
                    Thread.sleep(1000);
                    int pelea = random.nextInt(2) + 1;
                    if (pelea == num_mago) {
                        System.out.println("El GUERRERO ");
                    } else {
                        System.out.println("El MAGO ");
                    }
                } else if (eleccion != 1 || eleccion != 2 || eleccion != 3) {
                    System.out.println("Empezamos mal soldado");
                    Thread.sleep(1000);
                    System.out.println("Debes poner un numero entre el 1 o el 3, te has equivocado");
                    Thread.sleep(1000);
                }
            } while (!eleccion_valida);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restaura el estado de interrupción
        }

    }

}
