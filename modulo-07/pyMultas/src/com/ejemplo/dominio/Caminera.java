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
}
