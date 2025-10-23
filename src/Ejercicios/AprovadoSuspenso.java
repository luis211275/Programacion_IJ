package Ejercicios;
import java.util.Scanner;
//    Aprobado/Reprobado - Verifica si una nota es aprobatoria (>=60)
public class AprovadoSuspenso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la nota obtenida: ");
        int n = sc.nextInt();
        if (n>=6){
            if (n<0 || n>10){
                System.out.print("El numero debe estar entre 0 y 10");
                return;
            }
            System.out.print("Felicidades, has aprovado");
        }
        else{
            System.out.print("Lo siento, pero has supendido");
        }
    }
}
