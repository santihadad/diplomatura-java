package com.ejemplo;

import com.ejemplo.dominio.Caminera;
import com.ejemplo.dominio.Multa;
import com.ejemplo.gui.JFMultas;

import java.util.Scanner;

public class Ejecutable {

    public static void main(String[] args) {
        /*
        //Variables
        int n; //total de multas a procesar
        Scanner entrada = new Scanner(System.in);
        float monto, total = 0;
        int conteo[] = new int[20];
        Caminera oCaminera = null;
        int cod;
        long acta;
        Multa multa = null; // referencia a un objeto multa

        //Validar n
        do {
            System.out.println("Ingrese la cantidad de actas a procesar");
            n = entrada.nextInt();
        } while (n <= 0);

        oCaminera = new Caminera(n);

        //Entradas
        for (int i = 0; i < n; i++) {

            do {
                System.out.println("Ingrese codigo de la multa");
                cod = entrada.nextInt();
            } while (cod < 1 || cod > 20);

            System.out.println("Ingrese monto de la multa");
            monto = entrada.nextFloat();

            //leer numero de acta
            System.out.println("Ingrese numero de acta de la multa");
            acta = entrada.nextLong();

            multa = new Multa(acta, cod, monto); //se crea la multa
            oCaminera.registrarMulta(multa); //registrando la multa a la caminera
        }

        //Salidas
        total = oCaminera.calcularTotal();
        System.out.println("Monto total recaudado: $" + total);

        conteo = oCaminera.contabilizarCodigosMulta();
        for (int i = 0; i < conteo.length; i++) {
            if (conteo[i] > 0) {
                System.out.println("Actas codigo: " + (i + 1) + ": " + conteo[i]);
            }
        }

        System.out.println(oCaminera.mostrarMayorCodigo());
        */
        
        JFMultas principal = new JFMultas();
        principal.setVisible(true);

    }
}
