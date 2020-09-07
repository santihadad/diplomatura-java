package com.ejemplo.dominio;

public class Libro extends Publicacion {
    //atributos:
    private String isbn;
    private String autor;

    //métodos:
    public Libro() {
        super();
        isbn = "Sin ISBN";
        autor = "Desconocido";
    }

    public Libro(String isbn, String autor, String titulo, int paginas) {
        //Se Agrega super() en caso de que no se llame a ningún constructor de la clase base
        super(titulo, paginas);
        this.isbn = isbn;
        this.autor = autor;
    }

    //getters y setters:
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

    //comportamientos propios:
    @Override
    public String toString() {
        //Redefiniedo el comportamiento toString()
        //permite devolver la representación del objeto como una cadena:
        String aux = "El libro con ISBN " + isbn + ", creado por el autor: "
                + autor + " tiene: " + getPaginas() + " páginas.";
        return aux;
    }
}