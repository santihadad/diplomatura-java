package com.ejemplo.dominio;

public class Biblioteca {
    private final Libro[] estanteria;
    private int ultimoLibro;

    public Biblioteca() {
        estanteria = new Libro[20];
        ultimoLibro = 0;
    }

    public Biblioteca(int cant) {
        estanteria = new Libro[cant];
    }

    public Libro[] getEstanteria() {
        return estanteria;
    }

    public boolean agregarLibro(Libro unLibro) {
        boolean aux = false;
   /*     for (int i = 0; i < estanteria.length; i++) {
            if (estanteria[i] == null) {
                estanteria[i] = unLibro;
                aux = true; // avisar que se pudo agregar el libro a la estantería
                break; // cortamos el ciclo para que no lo agregue en todas las posiciones libres
            }
        }*/
        if (ultimoLibro < estanteria.length) { // Si no esta llena la estanteria
            estanteria[ultimoLibro] = unLibro; // Acceso directo al arreglo
            aux = true;
            ultimoLibro++; // actualizo la posicion para el proximo ingreso
        }
        return aux; //permite informar si efectivamente se pudo agregar el libro
    }

    public String mostrarListado() {
        String aux = "Estanteria:\n[";
        for (int i = 0; i < estanteria.length; i++) {
            if (estanteria[i] != null) {
                aux += estanteria[i].getTitulo() + "\t|";
            } else {
                aux = aux + "Lugar vacío\t|";
            }

        }
        aux += "]";

        return aux;
    }
}

