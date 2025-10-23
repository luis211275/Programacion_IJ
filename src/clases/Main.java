package clases;

public class Main {
    private static MyScanner sc = new MyScanner();
    public static void main(String[] args) {
        int numero = sc.pedirNumero("ingrese un numero");
        System.out.println(numero);
        char letra = sc.pedirLetra("ingrese una letra");
        System.out.println(letra);
        String texto = sc.pideTexto("escribe texto");
    }
}
