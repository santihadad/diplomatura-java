package com.ejemplo;

import com.ejemplo.dominio.Libro;

import java.util.Scanner;

public class Ejecutable {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        // Libro creado con valores por defecto
        Libro libro1, libro2; // Estos son referencias a objetos
        libro1 = new Libro();
        libro1.setIsbn("25-45-78");
        libro1.setAutor("Otro Autor");
        libro1.setNumeroPaginas(500);

        // Libro creado con valores ingresado por teclado
        System.out.println("Ingrese el ISBN del libro");
        String isbn = entrada.nextLine();

        System.out.println("Ingrese el Titulo del libro");
        String titulo = entrada.nextLine();

        System.out.println("Ingrese el Autor del libro");
        String autor = entrada.nextLine();

        System.out.println("Ingrese cantidad de paginas del libro");
        int paginas = entrada2.nextInt();

        libro2 = new Libro(isbn, autor, titulo, paginas);

        //Resultados
        System.out.println("Libro 1: " + libro1);
        System.out.println("Libro 2: " + libro2.toString());

        if (libro1.getNumeroPaginas() > libro2.getNumeroPaginas()) {
            System.out.println("Libro 1 con mas paginas");
        } else if (libro2.getNumeroPaginas() > libro1.getNumeroPaginas()) {
            System.out.println("Libro 2 con mas paginas");
        } else {
            System.out.println("Ambos libros tienen la misma cantidad de paginas");
        }
    }
}
