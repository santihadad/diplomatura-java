package com.ejemplo;

import com.ejemplo.dominio.ParOrdenado;

import java.util.Scanner;

public class Ejecutable {

    public static void main(String[] args) {
        // write your code here
        Scanner entrada = new Scanner(System.in);

        ParOrdenado par1 = new ParOrdenado();

        System.out.println("Ingrese las coordenadas de X");
        par1.setCoordenadaX(entrada.nextDouble());

        System.out.println("Ingrese las coordenadas de Y");
        par1.setCoordenadaY(entrada.nextDouble());

        System.out.println(par1.toString());
        System.out.println(par1.validarCuadrante());
        System.out.println(par1.distanciaAlCero());

    }
}
