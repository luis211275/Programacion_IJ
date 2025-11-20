package GestorPeliculas;
/*
Alumno - Luis López-Nuño
 */


public class GestorPeliculas {
    public static void main(String[] args) {
        Filmoteca filmoteca = new Filmoteca();
        Pelicula pelicula1 = new Pelicula("Interestelar", "Nolan", 280);
        Pelicula pelicula2 = new Pelicula("El señor de los anillos", "Peter", 180);
        Pelicula pelicula3 = new Pelicula("Oppenheimer", "Nolan", 180);
        Pelicula pelicula4 = new Pelicula("El padrino", "Francis", 175);

        filmoteca.añadirPelicula(pelicula1);
        filmoteca.añadirPelicula(pelicula2);
        filmoteca.añadirPelicula(pelicula3);
        filmoteca.añadirPelicula(pelicula4);



        System.out.println("===CATALOGO DE PELICULAS===");
        filmoteca.listarPeliculas();

        System.out.println("===PELICULAS ENTRE 180 Y 300 MINS===");
        filmoteca.buscarPorDuracion(180, 300);

        System.out.println("===PELICULAS DE NOLAN===");
        filmoteca.buscarPorDirector("Nolan");


    }
}
