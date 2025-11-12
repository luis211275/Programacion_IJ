package Juego_sencillo;

import clases.MyScanner;

import java.util.Scanner;

public class Juego {
    private static final MyScanner sc = new MyScanner();

    public static void main(String[] args) {
        Personajes pj1 = new Personajes("GUERRERO", 80, 35, 25);
        Personajes pj2 = new Personajes("MAGO", 65, 55, 25);


        Inicio();
        partida(pj1, pj2);
    }


    public static void Inicio() {
        try {
            String nombre1;
            String nombre2;


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
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static int Menu(Personajes pj) {

        try {

            boolean correcto;
            int opcion;
            do {
                System.out.println("¿ Que vas a hacer " + pj.getNombre() + "?");
                Thread.sleep(500);
                System.out.println("1. ATACAR");
                Thread.sleep(500);
                System.out.println("2. DEFENDER");
                Thread.sleep(500);
                System.out.println("3. Ataque especial (solo se podrá tirar una vez en toda la partida)");
                opcion = sc.pedirNumero("Opcion: ");
                if (opcion < 1 || opcion > 3) {
                    Thread.sleep(300);
                    System.out.println("Opcion invalida");
                    correcto = false;
                } else if (opcion == 2 && pj.getDefensa() <= 0 || opcion == 4 && pj.getDefensa() <= 0) {
                    Thread.sleep(300);
                    System.out.println("PERO SI NO TIENES VIDA!!!");
                    Thread.sleep(1000);
                    correcto = true;
                    opcion = 4;
                } else {
                    correcto = true;
                }
            } while (!correcto);

            return opcion;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return 0;
        }
    }

    public static void partida(Personajes pj1, Personajes pj2) {

        try {
            int ataques_especiales1 = 0;
            int ataques_especiales2 = 0;


            int turnos = 10;

            for (int i = 0; i < turnos; i++) {
                int accionpj1 = Menu(pj1);
                int accionpj2 = Menu(pj2);


                if (accionpj1 == 1 && accionpj2 == 2) {
                    int ataque = pj1.getAtaque();
                    int defensa = pj1.getDefensa();
                    Thread.sleep(500);
                    System.out.println("El " + pj1.getNombre() + "ha atacado y el " + pj2.getNombre() + " decidió defender");
                    Thread.sleep(1000);
                    pj2.setDefensa(defensa - ataque);
                    System.out.println("Asi estan los personajes despues de este ataque");
                    System.out.println(pj1.toString());
                    Thread.sleep(500);
                    System.out.println(pj2.toString());


                } else if (accionpj1 == 2 && accionpj2 == 1) {
                    int defensa = pj1.getDefensa();
                    int ataque = pj2.getAtaque();
                    Thread.sleep(500);
                    System.out.println("El " + pj1.getNombre() + "ha defendido y el " + pj2.getNombre() + " decidió atacar");
                    Thread.sleep(1000);
                    pj1.setDefensa(defensa - ataque);
                    System.out.println("Asi estan los personajes despues de este ataque");
                    System.out.println(pj1.toString());
                    Thread.sleep(500);
                    System.out.println(pj2.toString());


                } else if (accionpj1 == 1 && accionpj2 == 1) {
                    int ataque1 = pj1.getAtaque();
                    int vida1 = pj2.getVida();
                    Thread.sleep(500);
                    System.out.println("LOS DOS HABEIS DECIDIDO ATACAR, POR LO QUE OS ATACAREIS MUTUAMENTE SIN DEFENDEROS.");
                    Thread.sleep(1000);
                    pj2.setVida(vida1 - ataque1);
                    int vida2 = pj1.getVida();
                    int ataque2 = pj2.getAtaque();
                    pj1.setVida(vida2 - ataque2);
                    System.out.println("Asi estan los personajes despues de este ataque");
                    System.out.println(pj1.toString());
                    Thread.sleep(500);
                    System.out.println(pj2.toString());


                } else if (accionpj1 == 2 && accionpj2 == 2) {
                    Thread.sleep(500);
                    System.out.println("EN ESTA BATALLA QUEREMOS SANGRE, SI LOS DOS OS DEFENDEIS TODO EL RATO, NO HABRÁ DIVERSIÓN");
                    Thread.sleep(1000);


                } else if (accionpj1 == 1 && accionpj2 == 4) {
                    int ataque = pj1.getAtaque();
                    int vida = pj2.getVida();
                    Thread.sleep(500);
                    System.out.println("El " + pj2.getNombre() + " ha decidido defender, pero.... NO TIENE DEFENSA, POR LO QUE ESTO LE AFECTARÁ DIRECTAMENTE A LA VIDA");
                    Thread.sleep(1000);
                    pj2.setVida(vida - ataque);
                    System.out.println("Asi estan los personajes despues de este ataque");
                    System.out.println(pj1.toString());
                    Thread.sleep(500);
                    System.out.println(pj2.toString());


                } else if (accionpj1 == 4 && accionpj2 == 1) {
                    int vida = pj1.getVida();
                    int ataque = pj2.getAtaque();
                    Thread.sleep(500);
                    System.out.println("El " + pj1.getNombre() + " ha decidido defender, pero.... NO TIENE DEFENSA, POR LO QUE ESTO LE AFECTARÁ DIRECTAMENTE A LA VIDA");
                    Thread.sleep(1000);
                    pj1.setVida(vida - ataque);
                    System.out.println("Asi estan los personajes despues de este ataque");
                    System.out.println(pj1.toString());
                    Thread.sleep(500);
                    System.out.println(pj2.toString());


                } else if (accionpj1 == 2 && accionpj2 == 4) {
                    System.out.println("Pero que hace el " + pj1.getNombre() + "tenias a tiro al " + pj2.getNombre());
                    System.out.println("Asi estan los personajes despues de esta defensa");
                    System.out.println(pj1.toString());
                    Thread.sleep(500);
                    System.out.println(pj2.toString());


                } else if (accionpj1 == 4 && accionpj2 == 2) {
                    System.out.println("Pero que hace el " + pj2.getNombre() + "tenias a tiro al " + pj1.getNombre());
                    System.out.println("Asi estan los personajes despues de esta defensa");
                    System.out.println(pj1.toString());
                    Thread.sleep(500);
                    System.out.println(pj2.toString());


                } else if (accionpj1 == 2 && accionpj2 == 3) {

                    if (ataques_especiales2 != 0) {
                        Thread.sleep(500);
                        System.out.println("sabes leer " + pj2.getNombre() + "? solo puedes hacer ese ataque 1 vez");
                    }

                    else {
                        int defensa = pj1.getDefensa();
                        Thread.sleep(500);
                        System.out.println("El " + pj2.getNombre() + " ha decidido hacer un SUPER ATAQUE, y el" + pj1.getNombre() + "ha decidido defenderlo");
                        Thread.sleep(500);
                        pj1.setDefensa(defensa - pj2.ataque_especial());
                        System.out.println("Asi estan los personajes despues de este ataque");
                        System.out.println(pj1.toString());
                        Thread.sleep(500);
                        System.out.println(pj2.toString());
                        ataques_especiales2++;
                    }


                } else if (accionpj1 == 3 && accionpj2 == 2) {
                    if (ataques_especiales1 != 0) {
                        Thread.sleep(500);
                        System.out.println("sabes leer " + pj1.getNombre() + "? solo puedes hacer ese ataque 1 vez");
                        break;
                    } else {

                        int defensa = pj2.getDefensa();
                        Thread.sleep(500);
                        System.out.println("El " + pj1.getNombre() + " ha decidido hacer un SUPER ATAQUE, y el " + pj2.getNombre() + " ha decidido defenderlo");
                        pj2.setDefensa(defensa - pj2.ataque_especial());
                        System.out.println("Asi estan los personajes despues de este ataque");
                        System.out.println(pj1.toString());
                        Thread.sleep(500);
                        System.out.println(pj2.toString());
                        ataques_especiales1++;
                    }


                } else if (accionpj1 == 3 && accionpj2 == 1) {
                    if (ataques_especiales1 != 0) {
                        Thread.sleep(500);
                        System.out.println("sabes leer " + pj1.getNombre() + "? solo puedes hacer ese ataque 1 vez");
                        break;
                    } else {
                        int ataque2 = pj2.getAtaque();
                        int vida1 = pj1.getVida();
                        int vida2 = pj2.getVida();
                        Thread.sleep(500);
                        System.out.println("El " + pj1.getNombre() + " ha decidido hacer un SUPER ATAQUE, y el" + pj2.getNombre() + " ha decidido atacar tambien, por lo que los dos os hareis vuestro respectivo daño");
                        Thread.sleep(500);
                        pj1.setVida(vida1 - ataque2);
                        pj2.setVida(vida2 - ataques_especiales1);
                        System.out.println("Asi estan los personajes despues de este ataque");
                        System.out.println(pj1.toString());
                        Thread.sleep(500);
                        System.out.println(pj2.toString());
                        ataques_especiales1++;
                    }


                } else if (accionpj1 == 1 && accionpj2 == 3) {

                    if (ataques_especiales2 != 0) {
                        Thread.sleep(500);
                        System.out.println("sabes leer " + pj2.getNombre() + "? solo puedes hacer ese ataque 1 vez");

                    } else {
                        int vida1 = pj2.getVida();
                        int ataque2 = pj1.getAtaque();
                        int vida2 = pj1.getDefensa();
                        Thread.sleep(500);
                        System.out.println("El " + pj2.getNombre() + " ha decidido hacer un SUPER ATAQUE, y el " + pj1.getNombre() + " ha decidido atacar tambien, por lo que los dos os hareis vuestro respectivo daño");
                        Thread.sleep(500);
                        pj1.setVida(vida2 - pj2.ataque_especial());
                        pj2.setVida(vida1 - ataque2);
                        System.out.println("Asi estan los personajes despues de este ataque");
                        System.out.println(pj1.toString());
                        Thread.sleep(500);
                        System.out.println(pj2.toString());
                        ataques_especiales2++;
                    }


                } else if (accionpj1 == 3 && accionpj2 == 3) {
                    if (ataques_especiales1 != 0) {
                        Thread.sleep(500);
                        System.out.println("sabes leer " + pj1.getNombre() + "? solo puedes hacer ese ataque 1 vez");
                    } else if (ataques_especiales2 != 0) {
                        Thread.sleep(500);
                        System.out.println("sabes leer " + pj2.getNombre() + "? solo puedes hacer ese ataque 1 vez");

                    } else if (ataques_especiales1 != 0 && ataques_especiales2 != 0) {
                        Thread.sleep(500);
                        System.out.println("No os enterais ninguno de los dos, solo podeis hacer ese ataque 1 vez");
                    } else {

                        int vida1 = pj1.getVida();
                        int vida2 = pj2.getVida();
                        Thread.sleep(500);
                        System.out.println("Tanto el " + pj1.getNombre() + " como el " + pj2.getNombre() + " han decidido hacer un SUPER ATAQUE");
                        Thread.sleep(500);
                        pj1.setVida(vida1 - pj2.ataque_especial());
                        pj2.setVida(vida2 - pj1.ataque_especial());
                        System.out.println("Asi estan los personajes despues de este ataque");
                        System.out.println(pj1.toString());
                        Thread.sleep(500);
                        System.out.println(pj2.toString());

                        ataques_especiales1++;
                        ataques_especiales2++;

                    }

                } else if (accionpj1 == 3 && accionpj2 == 4) {
                    if (ataques_especiales1 != 0) {
                        Thread.sleep(500);
                        System.out.println("sabes leer " + pj1.getNombre() + "? solo puedes hacer ese ataque 1 vez");
                    }else {

                        int vida2 = pj2.getVida();
                        Thread.sleep(500);
                        System.out.println("El " + pj1.getNombre() + " ha decidido hacer un SUPER ATAQUE, y el " + pj2.getNombre() + " ha decidido defenderlo, pero ya no tiene defensa!!!");
                        pj2.setVida(vida2 - pj1.ataque_especial());
                        System.out.println("Asi estan los personajes despues de este ataque");
                        System.out.println(pj1.toString());
                        Thread.sleep(500);
                        System.out.println(pj2.toString());
                        ataques_especiales1++;
                    }

                } else if (accionpj1 == 4 && accionpj2 == 3) {
                    if (ataques_especiales2 != 0) {
                        Thread.sleep(500);
                        System.out.println("Sabes leer " + pj2.getNombre() + "? Solo puedes hacer ese ataque 1 vez");
                    }else {

                        int vida1 = pj1.getVida();
                        Thread.sleep(500);
                        System.out.println("El " + pj2.getNombre() + " ha decidido hacer un SUPER ATAQUE, y el " + pj1.getNombre() + " ha decidido defenderlo, pero ya no tiene defensa!!!");
                        pj1.setVida(vida1 - pj2.ataque_especial());
                        System.out.println("Asi estan los personajes despues de este ataque");
                        System.out.println(pj1.toString());
                        Thread.sleep(500);
                        System.out.println(pj2.toString());
                        ataques_especiales2++;
                    }

                }


                if (pj1.getVida() <= 0) {
                    Thread.sleep(1200);
                    System.out.println("HA GANADO EL " + pj2.getNombre() + " MUCHISIMAS FELICIDADES.");
                    return;
                } else if (pj2.getVida() <= 0) {
                    Thread.sleep(1200);
                    System.out.println("HA GANADO EL " + pj1.getNombre() + " MUCHISIMAS FELICIDADES.");
                    return;
                }

            }


            if (pj1.getVida() > pj2.getVida()) {
                Thread.sleep(1200);
                System.out.println("HAN ACABADO TODAS LAS RONDAS, POR LO QUE EL GANADOR ES EL " + pj1.getNombre() + " YA QUE TIENE MAS VIDA QUE EL " + pj2.getNombre());

            } else if (pj2.getVida() > pj1.getVida()) {
                Thread.sleep(1200);
                System.out.println("HAN ACABADO TODAS LAS RONDAS, POR LO QUE EL GANADOR ES EL " + pj2.getNombre() + " YA QUE TIENE MAS VIDA QUE EL " + pj1.getNombre());

            } else if (pj1.getVida() == pj2.getVida()) {
                Thread.sleep(1200);
                System.out.println("NO PUEDE SER, HABEIS QUEDADO EMPATE!!!!");

            } else if (pj1.getVida() < 0 && pj2.getVida() < 0) {
                Thread.sleep(1200);
                System.out.println("Los dos os habeis hecho un ataque que os ha hecho morir a la vez. HABEIS PERDIDO LOS DOS...");
            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }

    }
}