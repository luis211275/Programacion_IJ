package Ejercicios;
//    Factorial - Calcula el factorial de un número
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero la cual se va a realizar su factorial: ");
        int num = sc.nextInt();
        int factorial = 1;
        for (int i=1;i<=num;i++){
            factorial *= i;
            System.out.println(factorial);
        }
    }
}
