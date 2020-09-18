/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.dominio;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author MARTIN
 */
public class Camion {

    private float cargaMax;
    private int estado;
    private ArrayList<Carga> cargas;

    public Camion() {
        estado = 1; //Disponible 
        cargas = new ArrayList<>();
    }

    public Camion(float cargaMax) {
        estado = 1; //Disponible 
        cargas = new ArrayList<>();
        this.cargaMax = cargaMax;
    }

    //getters y setter para el viernes
    public float getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(float cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public float calcularPeso() {
        float aux = 0;
        for (Carga x : cargas) {
            aux += x.calcularPeso();
        }
        return aux;
    }

    public boolean subir(Carga carga) {
        boolean aux = false;

        if (carga == null) {
            float pesoTotal = this.calcularPeso() + carga.calcularPeso();
            if (estado == 1 && pesoTotal <= cargaMax) {
                cargas.add(carga);
                aux = true; //Aviso de carga
            }

        }

        return aux;
    }

    public int totalCargas() {
        return cargas.size();
    }

    public String mostrarListado() {
        Collections.sort(cargas);
        StringBuilder sb = new StringBuilder("Listado de cargas\n");
        // StringBuilder optimiza concatenacion de las cadenas
        for (Carga carga : cargas) {
            sb.append(carga.toString()).append("\n");
        }

        return sb.toString();
    }

    public boolean estaListoParaSalir() {
        /*boolean aux = false;
        if (estado == 1 && this.calcularPeso() >= 0.75 * cargaMax) {
            aux = true;
        }
         */
        return (estado == 1 && this.calcularPeso() >= (0.75 * cargaMax));
    }

}
