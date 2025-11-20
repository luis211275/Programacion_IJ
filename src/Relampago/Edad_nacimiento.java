package Relampago;

import java.util.Scanner;

public class Edad_nacimiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el año de nacimiento");
        int nacimiento = sc.nextInt();
        int numero = 2025 - nacimiento;
        System.out.println("Su edad es: " + numero);
    }
}
