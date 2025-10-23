import java.util.Arrays;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
    int[][]matriz = {
            {10,20,30},
            {40,50,60},
            {70,80,90}
    };
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingresa el numero que quieres buscar en el array: ");
    int buscar = sc.nextInt();
        boolean encontrado = false;
        for (int [] matrices : matriz)
            for (int numero : matrices)
                if (buscar == numero) {
                    encontrado = true;
                    break;
                }
        if(encontrado == true) {
                System.out.println("El numero que has escrito si que esta en el array");
            }
        else {
                System.out.println("No existe el numero que quieres buscar");
            }
        }
    }