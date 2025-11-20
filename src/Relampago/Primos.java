package Relampago;

public class Primos {
    public static void main(String[] args) {


        int suma = 0;

        for (int i = 2; i <= 100; i++) {
            boolean esPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {

                System.out.println(i + " es primo");
                suma += i;
            }
        }
       System.out.println("La suma de los numeros primos entre el 0 y el 100 es: " + suma);
    }
}
