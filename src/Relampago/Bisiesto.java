package Relampago;

public class Bisiesto {
    private static final MyScanner sc = new MyScanner();
public static void main(String[] args) {
    int año = sc.pedirNumero("Introduce el año: ");
    if (año % 4 == 0 && año % 100 != 0){
        System.out.println("Es un año bisiesto");
    } else if (año % 400 == 0) {
        System.out.println("Es un año bisiesto");
    }else {
        System.out.println("No es bisiesto");
    }
}
}
