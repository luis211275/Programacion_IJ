package Ejercicios;
//    Par o impar - Determina si un número es par o impar
import java.util.Scanner;
public class ParOImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el numero que quiere comprovar si es par o impar: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0){
            System.out.println("El numero que has introducido es par");
        }
        else {
            System.out.println("El numero que has introducido es impar");
        }
    }
}
