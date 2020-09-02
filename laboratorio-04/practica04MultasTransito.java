import java.util.Scanner;

public class practica04MultasTransito {
    public static void main(String[] args) {
        int cantidadDeActas;
        float montoTotalMultas;
        montoTotalMultas = 0;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Ingrese la cantidad de actas labradas");
            cantidadDeActas = entrada.nextInt();
        } while (cantidadDeActas <= 0);

        int codigos[] = new int[cantidadDeActas];
        float montos[] = new float[cantidadDeActas];

        for (int i = 0; i < cantidadDeActas; i++) {
            do {
                System.out.println("Ingrese el codigo de infraccion: valores del 1 al 20");
                codigos[i] = entrada.nextInt();
            } while (codigos[i] < 1 || codigos[i] > 20);

            do {
                System.out.println("Ingrese el monto en $ de la multa");
                montos[i] = entrada.nextFloat();
            } while (montos[i] <= 0);

            montoTotalMultas = montoTotalMultas + montos[i];
        }

        int conteo[] = new int[20];

        for (int i = 0; i < cantidadDeActas; i++) {
            conteo[codigos[i] - 1]++;
        }

        int mayor = conteo[0];
        int tipoDeCodigo = 1;

        for (int i = 1; i < conteo.length; i++) {
            if (conteo[i] > mayor) {
                mayor = conteo[i];
                tipoDeCodigo = i + 1;
            }
        }

        System.out.println("El total facturado durante el fin de semana es de: $" + montoTotalMultas);
        for (int i = 0; i < conteo.length; i++) {
            if (conteo[i] > 0) {
                System.out.println("El codigo " + (i + 1) + " tuvo " + conteo[i] + " actas labradas");
            }
        }
        System.out.println("El codigo de infraccion mas frecuente fue el: " + tipoDeCodigo);
    }
}
