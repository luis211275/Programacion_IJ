import  java.util.Scanner;
public class MainArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Area calc = new Area ();
        System.out.println("ingrese el lado del cuadrado para hacer su area");
        int area = sc.nextInt();
        System.out.println ("ingrese la altura del rectangulo para hayar su area");
        int altura = sc.nextInt();
        System.out.println ("ingrese la base de su rectangulo para hayar su area");
        int base = sc.nextInt();
        System.out.println ("ingrese el radio de la circunferencia para hayar su area");
        int radio = sc.nextInt();
        System.out.println("el area del cuadrado es: " + calc.CalcularArea(area));
        System.out.println("el area del rectangulo es: " + calc.CalcularArea(altura, base));
        System.out.println("El area de la circunferencia es: " + calc.CalcularArea(radio));

    }
}

