package com.ejemplo;

import java.util.Scanner;

public class Ejecutable {

    public static void main(String[] args) {
        //Variables
        int n; //total de multas a procesar
        float total = 0; // acumulador
        int pos;
        int may, codMay;
        Scanner entrada = new Scanner(System.in);

        int codigos[]; // es una referencia al arreglo todavia indefinido
        float montos[];
        int conteo[] = new int[20];

        do {
            System.out.println("Ingrese la cantidad de actas a procesar");
            n = entrada.nextInt();
        } while (n <= 0);

        codigos = new int[n];
        montos = new float[n];

        //Entradas
        for (int i = 0; i < n; i++) {
            do {
                System.out.println("Ingrese codigo de la multa");
                codigos[i] = entrada.nextInt();
            } while (codigos[i] < 1 || codigos[i] > 20);

            System.out.println("Ingrese monto de la multa");
            montos[i] = entrada.nextFloat();
            // acumulamos los montos de las multas cargadas
            total += montos[i];
        }

        //Procesos
        //contar codigos de actas labradas
        for (int i = 0; i < codigos.length; i++) {
            conteo[codigos[i] - 1]++;
        }

        //buscar el codigo de infraccion que mas se presento
        may = conteo[0];
        codMay = 1;
        for (int i = 0; i < conteo.length; i++) {
            if (conteo[i] > may) {
                may = conteo[i];
                codMay = i + 1;
            }
        }

        //Salidas
        System.out.println("Monto total recaudado: $" + total);

        for (int i = 0; i < conteo.length; i++) {
            if (conteo[i] > 0) {
                System.out.println("Actas codigo: " + (i + 1) + ": " + conteo[i]);
            }
        }

        System.out.println("El codigo de infraccion que mas se presento es: " + codMay + " con: " + may + " actas labradas");
    }
}
