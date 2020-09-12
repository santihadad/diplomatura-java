package com.ejemplo.dominio;

public class Multa {
    //Atributos
    private long acta;
    private int codigo;
    private float monto;

    //Constructores
    public Multa(long acta, int codigo, float monto) {
        this.acta = acta;
        this.codigo = codigo;
        this.monto = monto;
    }

    //Comportamientos de acceso
    public long getActa() {
        return acta;
    }

    public void setActa(long acta) {
        this.acta = acta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    //Comportamientos propio
    public float calcularMonto() {
        return monto;
    }

    @Override
    public String toString() {
        return "Acta N: " + acta + " |Codigo de infraccion: " + codigo + " |Monto: $" + monto;
    }
}
