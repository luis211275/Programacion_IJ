package biblioteca;

import java.util.ArrayList;

public class Bibliotecas {
    private String nombre;
    private String registro;
    private ArrayList<Libro> libros;

    public Bibliotecas(String nombre, String registro) {
        this.nombre = nombre;
        this.registro = registro;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }


    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public void agregarLibros(Libro libro) {
        libros.add(libro);
    }


    public void MostrarInformacion(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Registro: " + this.registro);

    }
}
