/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.dominio;

/**
 *
 * @author Santiago
 */
public class Packing extends Carga {

    private float pesoCaja;
    private int cantidad;
    private float pesoEstructura;

    public Packing(float pesoCaja, int cantidad, float pesoEstructura, String contenido) {
        super(contenido);
        this.pesoCaja = pesoCaja;
        this.cantidad = cantidad;
        this.pesoEstructura = pesoEstructura;
    }

    public float getPesoCaja() {
        return pesoCaja;
    }

    public void setPesoCaja(float pesoCaja) {
        this.pesoCaja = pesoCaja;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPesoEstructura() {
        return pesoEstructura;
    }

    public void setPesoEstructura(float pesoEstructura) {
        this.pesoEstructura = pesoEstructura;
    }

    @Override
    public float calcularPeso() {
        float aux = pesoCaja * cantidad + pesoEstructura;

        return aux;
    }

    @Override
    public String toString() {
        return super.toString() + "|peso x Caja: " + pesoCaja + "|cantidad: " + cantidad + "|peso estructura: " + pesoEstructura + '}';
    }

}
