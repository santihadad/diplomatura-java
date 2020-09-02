package com.ejemplo.dominio;

public class Revista extends Publicacion {
    private int codigo;

    public Revista() {
        //super(); no es necesario llamarlo ya que lo agrega Java.
        codigo = 0;
    }

    public Revista(String titulo, int paginas, int codigo) {
        super(titulo, paginas); // llamar al constructor padre
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Revista " + super.toString();
    }
}
