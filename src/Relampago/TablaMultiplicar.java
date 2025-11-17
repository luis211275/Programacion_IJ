package Relampago;

import java.util.Scanner;

public class TablaMultiplicar {
    private static final MyScanner sc = new MyScanner();
    public static void main(String args[]) {
        int num = sc.pedirNumero("introduce el numero de la multiplicacion: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "x" + i + "=" + num * i);
        }
    }
}
