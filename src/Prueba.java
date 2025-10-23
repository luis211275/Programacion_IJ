public class Prueba {
    public static void main(String[] args) {
        String[] nombres = {"Guerrero", "Mago", "Arquero"};
        int[] niveles = {0, 0, 0};
        int[] vidas = {80, 65, 70};
        int[] ataques = {35, 55, 45};
        int[] defensas = {25, 20, 25};
        System.out.println("Hola soldado");
        System.out.println("Bienvenido a este gran juego en el que te enfrentaras a grandes batallas: ");

        System.out.println("Pero antes, debes elegir el personaje, hazlo con cabeza, por que al que los que no elijas tendras que luchar contra ellos");

        System.out.println("El " + nombres[0] + "\n" + "NIVEL: " + niveles[0] + "\n"+ "VIDA: " + vidas[0] + "\n" +"ATAQUE: " + ataques[0] + "\n" +"DEFENSA: " + defensas[0]);

        System.out.println("El " + nombres[1] + "\n" + "NIVEL: " + niveles[1] + "\n"+ "VIDA: " + vidas[1] + "\n" +"ATAQUE: " + ataques[1] + "\n" +"DEFENSA: " + defensas[1]);

        System.out.println("El " + nombres[2] + "\n" + "NIVEL: " + niveles[2] + "\n"+ "VIDA: " + vidas[2] + "\n" +"ATAQUE: " + ataques[2] + "\n" +"DEFENSA: " + defensas[2]);
    }
}
