package Relampago;

public class Calculadora {
    private static final MyScanner sc = new MyScanner();

    public static void main(String[] args) {
        double num1 = sc.pedirDecimal("introduce el primer numero");
        double num2 = sc.pedirDecimal("introduce el segundo numero");
        String operacion = sc.pideTexto("Que operacion quieres haver con los dos numeros\n multiplicar(*)\n sumar (+)\n restar(-)\n dividir(/)");
        if (operacion.equals("+")) {
            System.out.println("El resultado es: " + (num1 + num2));

        } else if (operacion.equals("-")) {
            System.out.println("El resultado es: " + (num1 - num2));

        } else if (operacion.equals("*")) {
            System.out.println("El resultado es: " + (num1 * num2));

        } else if (operacion.equals("/")) {
            System.out.println("El resultado es: " + (num1 / num2));
        }else{
            System.out.println("Peticion erronea");
        }
    }
}
