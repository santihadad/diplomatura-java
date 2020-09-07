package com.ejemplo.dominio;

public class Revista extends Publicacion {
    private int codigo;

    public Revista() {
        //super(); no sería necesario llamarla, me lo agrega Java automáticamente
        codigo = 1;
    }

    public Revista(int codigo, String titulo, int paginas) {
        super(titulo, paginas);//llamar al constructor de la clase padre:
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
        //Especializando el comportamiento toString()
        return "Revista " + super.toString();
    }
}
