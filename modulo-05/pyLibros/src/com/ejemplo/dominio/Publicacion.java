package com.ejemplo.dominio;

public class Publicacion {
    private String titulo;
    private int paginas;

    public Publicacion() {
        paginas = 1;
        titulo = "Sin definir";
    }

    public Publicacion(String titulo, int paginas) {
        this.titulo = titulo;
        this.paginas = validarPaginas(paginas);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = validarPaginas(paginas);
    }

    private int validarPaginas(int paginas) {
        return (paginas > 0) ? paginas : 1;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + " con " + paginas + "páginas";
    }
}
