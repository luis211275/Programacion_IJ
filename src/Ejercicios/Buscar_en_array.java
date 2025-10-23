package Ejercicios;
import java.util.Scanner;
//    Buscar elemento - Verifica si un número está en un array
public class Buscar_en_array {
    public static void main(String[] args) {
        int[] numero = {1,5,3,8,4,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero que quiere buscar en el array: ");
        int num = sc.nextInt();
        if (num==numero[0]){
            System.out.println("El numero esta en la lista");
        }
        else{
            System.out.println("El numero no esta en la lista");
        }
    }
}
