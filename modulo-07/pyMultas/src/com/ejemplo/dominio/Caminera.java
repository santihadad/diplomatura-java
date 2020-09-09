package com.ejemplo.dominio;

public class Caminera {
    private Multa multas[];
    private int ultimaCarga;

    public Caminera(int cantidad) {
        multas = new Multa[cantidad];
    }

    public boolean registrarMulta(Multa multa) {
        boolean aux = false;
        if (ultimaCarga < multas.length) {
            multas[ultimaCarga] = multa;
            aux = true;
            ultimaCarga++;
        }
        return aux;
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
        for (int i = 0; i < multas.length; i++) {
            pos = multas[i].getCodigo() - 1;
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
}
