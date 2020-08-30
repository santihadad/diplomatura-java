package com.ejemplo;

import com.ejemplo.dominio.CuentaBanco;

import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        CuentaBanco miCuenta = new CuentaBanco("Juan");
        miCuenta.setCodigo(1);
        miCuenta.depositar(1000);
        miCuenta.extraer(2000);

        System.out.println(miCuenta.mostrarDatos());

        System.out.println("Ingrese codigo de la cuenta");
        int codigo = entrada.nextInt();

        System.out.println("Ingrese el saldo inicial cuenta");
        float saldo = entrada.nextFloat();

        System.out.println("Ingrese el nombre del titular");
        String titular = entrada2.nextLine();

        CuentaBanco otraCuenta = new CuentaBanco(codigo, saldo, titular);

        otraCuenta.depositar(-900);
        otraCuenta.extraer(100);

        System.out.println(otraCuenta.mostrarDatos());

        if (miCuenta.getSaldo() > otraCuenta.getSaldo()) {
            System.out.println("La cuenta de mayor saldo es la: " + miCuenta.getCodigo());
        } else if (otraCuenta.getSaldo() > miCuenta.getSaldo()) {
            System.out.println("La cuenta de mayor saldo es la: " + otraCuenta.getCodigo());
        } else {
            System.out.println("Las cuentas tienen el mismo saldo");
        }
    }
}
