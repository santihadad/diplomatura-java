package com.ejemplo.dominio;

public class ParOrdenado {
    // Atributos:
    private double coordenadaX;
    private double coordenadaY;

    //Metodos
    //Constructores:
    public ParOrdenado() {
        coordenadaX = 0;
        coordenadaY = 0;
    }

    //Geter y Seter
    public double getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(double coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public double getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(double coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    //Comportamiento
    public String toString() {
        String aux = "El par ordenado es: (" + coordenadaX + ";" + coordenadaY + ")";
        return aux;
    }

    public String distanciaAlCero() {
        double sumatoria = Math.pow(coordenadaX, 2) + Math.pow(coordenadaY, 2);
        double distancia = Math.sqrt(sumatoria);

        return "La distancia al origen es de: " + distancia;
    }

    public String validarCuadrante() {
        String cuadrante;
        if (coordenadaX > 0 && coordenadaY > 0) {
            cuadrante = "Primer cuadrante";
        } else if (coordenadaX > 0 && coordenadaY < 0) {
            cuadrante = "Cuarto cuadrante";
        } else if (coordenadaX < 0 && coordenadaY > 0) {
            cuadrante = "Segundo cuadrante";
        } else if (coordenadaX < 0 && coordenadaY < 0) {
            cuadrante = "Tercer cuadrante";
        } else {
            cuadrante = "El punto se encuentra sobre algun eje";
        }
        return cuadrante;
    }


}
