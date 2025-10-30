package biblioteca;

public class Libro {
    private String Titulo;
    private int ISBN;
    private int año;
    private String genero;

    public Libro(String titulo, String ISBN, int año, String genero) {
        Titulo ="El quijote";
        this.ISBN = 3545345;
        this.año = 453;
        this.genero = "Narrativo";
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void mostrarLibros(){
        System.out.println("Titulo: "+ Titulo);
        System.out.println("ISBN: "+ ISBN);
        System.out.println("Año: "+ año);
        System.out.println("Año: "+ genero);

    }
}
