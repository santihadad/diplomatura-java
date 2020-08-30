package com.ejemplo;

import com.ejemplo.dominio.Libro;

import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        int cantidad;
        do {
            System.out.println("Ingrese la cantidad de libros en biblioteca");
            cantidad = entrada2.nextInt();
        } while (cantidad <= 0);

        String isbn, titulo, autor;
        int paginas;

        // Crear un arreglo que represente mi biblioteca, fisicamente representa el estante
        Libro estanteria[] = new Libro[cantidad];
        for (int i = 0; i < estanteria.length; i++) {
            System.out.println("Ingrese el ISBN del libro");
            isbn = entrada.nextLine();

            System.out.println("Ingrese el Titulo del libro");
            titulo = entrada.nextLine();

            System.out.println("Ingrese el Autor del libro");
            autor = entrada.nextLine();

            System.out.println("Ingrese cantidad de paginas del libro");
            paginas = entrada2.nextInt();

            estanteria[i] = new Libro(isbn, autor, titulo, paginas);
        }

        for (int i = 0; i < estanteria.length; i++) {
            System.out.println("Libro: " + (i + 1) + ": " + estanteria[i].toString());
        }

    }
}
