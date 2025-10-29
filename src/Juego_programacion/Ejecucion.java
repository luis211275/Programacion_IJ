package Juego_programacion;

import java.util.Random;
import java.util.Scanner;


public class Ejecucion {
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
            System.out.println("El " + nombres[1] + "\n" + "NIVEL: " + niveles[1] + "\n" + "VIDA: " + mago.vida_guerrero + "\n" + "ATAQUE: " + mago.ataque_guerrero + "\n" + "DEFENSA: " + mago.defensa_guerrero);
            System.out.println("------------------------------------------------------------------------------------");
            Thread.sleep(3000);
            System.out.println("El " + nombres[2] + "\n" + "NIVEL: " + niveles[2] + "\n" + "VIDA: " + arquero.vida_guerrero + "\n" + "ATAQUE: " + arquero.ataque_guerrero + "\n" + "DEFENSA: " + arquero.defensa_guerrero);
            System.out.println("------------------------------------------------------------------------------------");
            Thread.sleep(2000);
            boolean eleccion_valida = false;
            do {

                System.out.println("Ahora, es el momento en el que el J1 seleccione su personaje: ");
                System.out.println("Si quieres que tu heroe sea el guerrero, pulsa 1. Si quieres que sea el mago pulsa 2. Si quieres que sea el arquero pulsa 3");
                int eleccion = sc.nextInt();

                if (eleccion == 1) {
                    System.out.println("Bien, has elegido al guerrero, buena idea");
                    Thread.sleep(1000);
                    int num_mago = 1;
                    int num_arquero = 2;
                    eleccion_valida = false;
                    Thread.sleep(500);
                    boolean j2_elecion = false;
                    do {
                        System.out.println("Despues de que el jugador 1 seleccione al guerrero, veamos a quien selecciona el jugador 2: ");
                        int eleccion2 = sc.nextInt();



                        if (eleccion2 == 2) {
                            System.out.println("Bien, el jugador 2 ha seleccionado el mago");
                            j2_elecion = true;
                            Thread.sleep(1000);
                            System.out.println("Despues de las elecciones, empecemos la pelea.");
                            Thread.sleep(1000);
                            System.out.println("Veamos quien empieza primero, si el jugador 1 o el jugador 2");
                            int inicio = random.nextInt(2) +1;
                            if (inicio == 1) {
                                System.out.println("empeiza el guerrero (jugador 1)");
                                Thread.sleep(1000);
                                String jugador1 = "guerrero";
                                String jugador2 = "mago";
                                System.out.println("Ahora el " + nombres[0] + " puede hacer 2 cosas, o atacar o defender, ¿que vas a hacer, atacar (1) o defender (2)");
                                int accion = sc.nextInt();
                                boolean accion_valida = false;
                                do {
                                    if (accion == 1) {
                                        System.out.println("El " + nombres[0] + " ha elegido atacar");
                                        accion_valida = true;
                                        Thread.sleep(1000);
                                        System.out.println("Ahora elige el " + nombres[1] + " puede atacar (1) o defender (2)");
                                        int accion2 = sc.nextInt();
                                        boolean accion_valida2 = false;
                                        do {
                                            if (accion2 == 1) {
                                                System.out.println("El " + nombres[1] + " ha elegido atacar");
                                                accion_valida2 = true;
                                            }
                                            else if (accion2 == 2) {
                                                System.out.println("El " + nombres[1] + " ha elegido defender");
                                                accion_valida2 = true;
                                            }
                                            else if (accion2 < 1 || accion2 > 2) {
                                                System.out.println("eleccion no valida");
                                            }
                                        }while (!accion_valida2);
                                        eleccion_valida=true;
                                    }
                                    else if (accion == 2) {
                                        System.out.println("El " + nombres[0] + " ha elegido defender");
                                        accion_valida = true;
                                    }
                                    else if (accion < 1 || accion > 2) {
                                        System.out.println("eleccion incorrecta");
                                    }
                                }while (!accion_valida);
                            }





                            else if (inicio == 2) {
                                System.out.println("empieza el mago (jugador 2)");
                                Thread.sleep(1000);
                                String inicio_pelea = "Mago";
                            }

                        }
                        else  if (eleccion2 == 3) {
                            System.out.println("Bien, el jugador 2 ha elegido al arquero");
                            j2_elecion = true;
                        }
                        else if  (eleccion2 > 3 || eleccion2 < 1) {
                            System.out.println("no, el numero debe estar entre el 1 y el 3");
                        }
                        else if  (eleccion2 == 1) {
                            System.out.println("no, el jugador2 no puede elegir el mismo campeon que el jugador1");
                        }

                    }while (!j2_elecion);
                } else if (eleccion == 2) {
                    System.out.println("Bien, has elegido al mago, buena idea");
                    Thread.sleep(1000);
                    eleccion_valida = true;
                    boolean j2_elecion = false;
                    do {
                        System.out.println("Despues de que el jugador 1 seleccione al mago, veamos a quien elecciona el jugador 2: ");
                        int eleccion2 = sc.nextInt();
                        if (eleccion2 == 1) {
                            System.out.println("Bien, el jugador 2 ha seleccionado al guerrero");
                            j2_elecion = true;
                        }
                        else  if (eleccion2 == 3) {
                            System.out.println("Bien, el jugador 2 ha elegido al arquero");
                            j2_elecion = true;
                        }
                        else if  (eleccion2 > 3 || eleccion2 < 1) {
                            System.out.println("no, el numero debe estar entre el 1 y el 3");
                        }
                        else if  (eleccion2 == 2) {
                            System.out.println("no, el jugador2 no puede elegir el mismo campeon que el jugador1");
                        }

                    }while (!j2_elecion);

                } else if (eleccion == 3) {
                    System.out.println("Bien, has elejido al arquero, buena idea");
                    Thread.sleep(1000);
                    eleccion_valida = true;
                    boolean j2_elecion = false;
                    do {
                        System.out.println("Despues de que el jugador 1 seleccione al arquero, veamos a quien selecciona el jugador 2: ");
                        int eleccion2 = sc.nextInt();
                        if (eleccion2 == 2) {
                            System.out.println("Bien, el jugador 2 ha seleccionado el mago");
                            j2_elecion = true;
                        }
                        else  if (eleccion2 == 1) {
                            System.out.println("Bien, el jugador 2 ha elegido al guerrero");
                            j2_elecion = true;
                        }
                        else if  (eleccion2 > 3 || eleccion2 < 1) {
                            System.out.println("no, el numero debe estar entre el 1 y el 3");
                        }
                        else if  (eleccion2 == 3) {
                            System.out.println("no, el jugador2 no puede elegir el mismo campeon que el jugador1");
                        }

                    }while (!j2_elecion);
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