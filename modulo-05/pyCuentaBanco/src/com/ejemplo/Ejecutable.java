package com.ejemplo;

import com.ejemplo.dominio.CuentaBanco;

public class Ejecutable {
    public static void main(String[] args) {
        CuentaBanco miCuenta = new CuentaBanco();
        miCuenta.setCodigo(1);

        System.out.println("Mi cuenta tiene codigo: " + miCuenta.getCodigo());
    }
}
