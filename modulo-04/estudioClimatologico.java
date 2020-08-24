import java.util.Scanner;

public class estudioClimatologico {
    public static void main(String[] args) {

        //Variables
        int n; //cantidad de temperaturas
        Scanner entrada = new Scanner(System.in);
        float acumulador, promedio;
        boolean avisoMenos10;

        //Inicializar
        acumulador = 0;
        avisoMenos10 = false;

        //Entrada
        do {
            System.out.println("Ingrese la cantidad de temperaturas a procesar");
            n = entrada.nextInt();
        } while (n <= 0);

        //Declarar y dimensionar arreglo de n temperaturas
        float[] temperaturas = new float[n];

        //Proceso
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Ingrese la temperatura: " + (i + 1) + " en grados centigrados");
            temperaturas[i] = entrada.nextFloat();
            acumulador += temperaturas[i];

            if (temperaturas[i] <= -10) {
                avisoMenos10 = true;
            }
        }

        //Ordenar las temperaturas y luego mostrar
        float aux;
        for (int i = 0; i < temperaturas.length - 1; i++) {
            for (int j = i + 1; j < temperaturas.length; j++) {
                if (temperaturas[i] < temperaturas[j]) {
                    aux = temperaturas[i];
                    temperaturas[i] = temperaturas[j];
                    temperaturas[j] = aux;
                }
            }
        }

        promedio = acumulador / temperaturas.length;

        //Resultados
        System.out.println("La temperatura promedio es de: " + promedio + "°C");

        if (avisoMenos10) {
            System.out.println("Paso al menos una temperatura menor o igual a -10°C");
        }

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Temperatura: " + (i + 1) + ": " + temperaturas[i]);
        }
    }
}
