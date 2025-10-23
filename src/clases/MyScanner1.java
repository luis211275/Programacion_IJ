package clases;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyScanner1 { private static Scanner sc;

    public MyScanner1() {
        sc = new Scanner(System.in);
    }

    public int pedirEdad(String mns) {
        int n = -1;
        boolean flag = true;
        while (flag) {
            try {
                System.out.println(mns);
                n = sc.nextInt();
                sc.nextLine();
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("Eso no es número!");
                sc.nextLine();
            }
        }
        return n;
    }

    public String pedirNombre(String texto) {
        String input;
        boolean valido;
        do {
            System.out.println(texto);
            input = sc.nextLine().trim();
            valido = input.matches("[a-zA-ZáéíóúüÁÉÍÓÚÜñÑ ]+");
            if (!valido) {
                System.out.println("no es un nombre lo que has escrito");
            }
        }  while (!valido);
        return input;
    }
}
