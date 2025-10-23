package Ejercicios;
//    Día de la semana - Muestra el día según un número (1-7)
import java.util.Scanner;
public class DiaSemanal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero y te diré el dia de la semana");
        int dia = sc.nextInt();
        if(dia<1 || dia>7){
            System.out.print("El numero debe estar entre 1 y 7");
            return;
        }
        switch(dia){
            case 1:
                System.out.print("Es lunes");
                break;
            case 2:
                System.out.print("Es martes");
                break;
            case 3:
                System.out.print("Es miercoles");
                break;
            case 4:
                System.out.print("Es jueves");
                break;
            case 5:
                System.out.print("Es viernes");
                break;
            case 6:
                System.out.print("Es sabado");
                break;
            default:
                System.out.print("es domingo");
                break;
        }
    }
}
