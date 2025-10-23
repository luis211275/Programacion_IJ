package Ejercicios;
import java.util.Scanner;
//    Leer y mostrar - Lee un nombre y lo muestra
public class nombre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = sc.nextLine();
        System.out.print(nombre +" " + apellido);
    }
}
