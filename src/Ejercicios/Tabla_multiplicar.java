package Ejercicios;
//    Tabla de multiplicar - Muestra la tabla de un número
import java.util.Scanner;
public class Tabla_multiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero que quiere que se haga la tabla de multimplicar hasta el 10: ");
        int num1 = sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(num1 + " x " + i + " = " + (num1*i));
        }
    }
}
