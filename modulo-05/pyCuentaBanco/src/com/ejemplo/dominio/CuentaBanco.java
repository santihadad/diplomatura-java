package com.ejemplo.dominio;

public class CuentaBanco {
    //1.Atributos:
    private int codigo;
    private float saldo;
    private String titular;

    //2.Constructores: se llama igual que la clase y no tiene tipo de retorno

    // Constructor por defecto, no tiene parametros
    public CuentaBanco() {
        codigo = 0;
        saldo = 0;
        titular = "Sin Definir";
    }

    //Constructor con parametros, tiene al menos una variable que viene de afuera para inicializar un atributo
    public CuentaBanco(String tit) {
        codigo = 0;
        saldo = 0;
        titular = tit;
    }

    // Constructor con todos los parametros para inicializar todos los atributos
    public CuentaBanco(int codigo, float saldo, String titular) {
        this.codigo = codigo;
        this.saldo = saldo;
        this.titular = titular;
    }


    //3.Comportamiento de acceso o accesores: Geters y Seters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    //4.Comportamientos propios de la clase: depositar() y extraer()
    public void depositar(float monto) {
        if (monto > 0) {
            saldo = saldo + monto;
        }
    }

    public void extraer(float monto) {
        if (monto > 0 && saldo >= monto) {
            saldo = saldo - monto;
        }
    }

    public String mostrarDatos() {
        String estado = "Cuenta N: " + codigo + " |Titular: " + titular + " |Saldo: $" + saldo;
        return (estado);
    }

}
