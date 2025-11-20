package GestorPeliculas;

/**
 * Clase Pelicula
 * @author Alumno: Luis López-Nuño
 * @version 1.0
 */

public class Pelicula {
    private String titulo;
    private String director;
    private int duracion;

    /**
     * Constructor principal de la clase pelicula
     *
     * @param titulo establece el titulo de la pelicula
     * @param director establece el director de la pelicula
     * @param duracion establece la duracion de la pelicula
     */
    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }


    /**
     * getter del atributo titulo
     *
     * @return el titulo de la pelicula
     */
    public String getTitulo() {
        return titulo;
    }


    /**
     * Setter del atributo titulo
     *
     * @param titulo establece el titulo de la pelicula
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }


    /**
     * Metodo para mostrar los datos de la pelicula
     *
     * @return texto formateado con los datos de la pelicula
     */
    @Override
    public String toString() {
        return String.format("Titulo %s | Director %s | Duracion %d mins", titulo, director, duracion);
    }
}
