package com.ejemplo.dominio;

public class Libro {
    //Atributos:
    private String isbn;
    private String autor;
    private String titulo;
    private int numeroPaginas;

    //Metodos:
    //Constructores
    public Libro() {
        isbn = "Sin ISBN";
        autor = "Desconocido";
        titulo = "Desconocido";
        numeroPaginas = 1;
    }

    public Libro(String isbn, String autor, String titulo, int numeroPaginas) {
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.numeroPaginas = validarPaginas(numeroPaginas);
    }

    //Geter y Seter
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = validarPaginas(numeroPaginas);
    }

    //Comportamiento Propio

    public String toString() {
        //permite devolver la representacion del objeto como cadena
        String aux = "El libro con ISBN " + isbn + ", creado por el autor: "
                + autor + " tiene: " + numeroPaginas + " paginas";

        return aux;
    }

    private int validarPaginas(int numeroPaginas) {

        return (numeroPaginas > 0) ? numeroPaginas : 1;
    }
}
