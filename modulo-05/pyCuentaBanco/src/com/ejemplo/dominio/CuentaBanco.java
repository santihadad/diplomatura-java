package com.ejemplo.dominio;

public class CuentaBanco {
    //atributos:
    private int codigo;
    private float saldo;
    private String titular;

    //comportamiento:
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int cod) {
        codigo = cod;
    }
}
