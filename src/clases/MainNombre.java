package clases;

public class MainNombre {
    private static MyScanner1 scanner1 = new MyScanner1();
    public static void main(String[] args) {
        String nombre = scanner1.pedirNombre("Ingrese el nombre: ");
        int numero =scanner1.pedirEdad("Ingrese la edad: ");
        System.out.println("Nombre ingresado: " + nombre);
        System.out.println("Edad ingresada: " + numero);
    }
}
