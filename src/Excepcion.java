import java.util.Scanner;

public class Excepcion {
    public static void main (String [] args) throws MiExcepcion{
            prueba();
    }

    public static void prueba() throws MiExcepcion{
        int SaldoBase = 2000;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el dinero que quiere sacar de su cuenta bancaria: ");
        int Dinero = sc.nextInt();
        if (Dinero >= SaldoBase){
            throw new MiExcepcion("El dinero que quiere sacar es superior al que tiene en la cuenta");
        }
    }

    public static class MiExcepcion extends Exception{
        public MiExcepcion(String mensaje){
            super(mensaje);
        }
    }
}
