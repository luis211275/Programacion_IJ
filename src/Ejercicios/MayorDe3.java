package Ejercicios;

import java.util.Scanner;

//Mayor de tres números - Encuentra el mayor de tres números
public class MayorDe3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print ("Introduce el primer numero que quieres comprovar: ");
        int a = sc.nextInt();
        System.out.print("Introduce el segundo numero que quieres comprovar: ");
        int b = sc.nextInt();
        System.out.print("Introduce el tercer numero quieres comprovar: ");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("El numero "+a+" es mayor que  el numero "+b+" y mayor que el numero "+c);
        }
        else if(b>a && b>c){
            System.out.println("el numero "+b+" es mayor que  el numero "+a + "y mayor que el numero "+c);
        }
        else{
            System.out.println("El numero " + c + " es mayor que el numero " + b + " y mayor que el numero " + a);
        }
    }
}
