import java.util.Scanner;

public class Clase10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona persona = new Persona();
        System.out.println("Introduce el nombre del persona");
        persona.setNombre(sc.next());
        System.out.println("Introduce el apellido del persona");
        persona.setApellido(sc.next());
        System.out.println("Introduce edad del persona");
        persona.setEdad(sc.nextInt());
        sc.nextLine();
        Direccion direccion = new Direccion();
        System.out.println("Introduce la calle: ");
        direccion.setCalle(sc.next());
        System.out.println("Introduce la numero de portal: ");
        direccion.setPortal(sc.nextInt());
        sc.nextLine();
        System.out.println("Introduce el numero del piso: ");
        direccion.setPiso(sc.nextInt());
        sc.nextLine();
        System.out.println("Introduce la letra del piso: ");
        direccion.setLetra(sc.next().charAt(0));//no detecta el caracter, entonces pongo q el primer valor que salga, por eso el 0(posicion 0), lo leera,y hara el trabajo de cojer un caracter
        persona.setDireccion(direccion);

        System.out.println(persona);
    }
}
