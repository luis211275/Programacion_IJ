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
            int[] vidas = {80, 65, 70};
            int[] ataques = {35, 55, 45};
            int[] defensas = {25, 20, 25};
            System.out.println("Hola soldado");
            Thread.sleep(1000);
            System.out.println("Bienvenido a este gran juego en el que te enfrentaras a grandes batallas: ");
            Thread.sleep(2000);
            System.out.println("Pero antes, debes elegir el personaje, hazlo con cabeza, por que al que los que no elijas tendras que luchar contra ellos");
            Thread.sleep(4000);
            System.out.println("El " + nombres[0] + "\n" + "NIVEL: " + niveles[0] + "\n" + "VIDA: " + vidas[0] + "\n" + "ATAQUE: " + ataques[0] + "\n" + "DEFENSA: " + defensas[0]);
            System.out.println("------------------------------------------------------------------------------------");
            Thread.sleep(3000);
            System.out.println("El " + nombres[1] + "\n" + "NIVEL: " + niveles[1] + "\n" + "VIDA: " + vidas[1] + "\n" + "ATAQUE: " + ataques[1] + "\n" + "DEFENSA: " + defensas[1]);
            System.out.println("------------------------------------------------------------------------------------");
            Thread.sleep(3000);
            System.out.println("El " + nombres[2] + "\n" + "NIVEL: " + niveles[2] + "\n" + "VIDA: " + vidas[2] + "\n" + "ATAQUE: " + ataques[2] + "\n" + "DEFENSA: " + defensas[2]);
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
                    eleccion_valida = true;System.out.println("Depues de haber elegido al guerrero, vamos a ver contra quien te vas a enfrentar");
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
                    System.out.println("Depues de haber elegido al guerrero, vamos a ver contra quien te vas a enfrentar");
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
