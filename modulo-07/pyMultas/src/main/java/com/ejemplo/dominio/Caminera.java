package com.ejemplo.dominio;

import java.util.ArrayList;

public class Caminera {
    private ArrayList<Multa> multas;

    public Caminera() {
        multas = new ArrayList<>(); // Lista vacia de objetos multa
    }

    public boolean registrarMulta(Multa x) {
        if (multas.contains(x)) {
            return false;
        }
        return multas.add(x);
    }

    public float calcularTotal() {
        float aux = 0;
        for (Multa multa : multas) {
            if (multa != null) {
                aux += multa.calcularMonto();
            }
        }
        return aux;
    }

    public int[] contabilizarCodigosMulta() {
        int conteo[] = new int[20];
        int pos;
        //contar codigos de actas labradas
        for (int i = 0; i < multas.size(); i++) {
            pos = multas.get(i).getCodigo() - 1;
            conteo[pos]++;
        }

        return conteo;
    }

    public String mostrarMayorCodigo() {
        String aux = "";
        int may, codMay;
        int conteo[] = this.contabilizarCodigosMulta();
        //buscar el codigo de infraccion que mas se presento
        may = conteo[0];
        codMay = 1;
        for (int i = 0; i < conteo.length; i++) {
            if (conteo[i] > may) {
                may = conteo[i];
                codMay = i + 1;
            }
        }
        aux = "Codigo de infraccion mas frecuente: " + codMay + ", con: " + may + " actas labradas";
        return aux;
    }
    
    public String mostrarMultas (){
        StringBuilder aux = new StringBuilder("");
 
        for (Multa x : multas){
            if (x != null) {
              aux.append(x.toString()).append ("\n");
            }
        }
        return aux.toString();
    }
}

