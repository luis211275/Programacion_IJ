package Relampago;

public class Factorial {
    private static final MyScanner sc = new MyScanner();
    public static void main(String[] args) {
        int num = sc.pedirNumero("Introduce el numero que se quiere hacer el factorial");
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
            System.out.println(factorial);
        }
    }
}
