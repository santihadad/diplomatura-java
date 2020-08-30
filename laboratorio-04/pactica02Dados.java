import java.util.Scanner;

public class pactica02Dados {
    public static void main(String[] args) {
        boolean valoresImpares;
        int nLanzamientos, valoresIguales, sumaDados, lanzamientoImpar;
        float porcentaje;

        valoresIguales = 0;
        lanzamientoImpar = 0;
        valoresImpares = false;

        Scanner entrada = new Scanner(System.in);
        System.out.println(" Bienvenido a la prueba estadistica con dados");

        do {
            System.out.println("Ingrese la cantidad de lanzamientos a realizar");
            nLanzamientos = entrada.nextInt();
        } while (nLanzamientos <= 0);

        int[] dado1 = new int[nLanzamientos];
        int[] dado2 = new int[nLanzamientos];

        for (int i = 0; i < nLanzamientos; i++) {
            dado1[i] = (int) (Math.random() * 6 + 1);
            dado2[i] = (int) (Math.random() * 6 + 1);

            if (dado1[i] == dado2[i]) {
                valoresIguales++;
            }

            sumaDados = dado1[i] + dado2[i];

            if (sumaDados % 2 != 0) {
                if (!valoresImpares) {
                    valoresImpares = true;
                    lanzamientoImpar = i + 1;
                }
            }

        }

        porcentaje = ((valoresIguales * 100) / nLanzamientos);

        System.out.println("Se obtuvo el mismo valor de los dados en un total de " + valoresIguales + " veces y respresenta el " + porcentaje + "%");
        if (valoresImpares) {
            System.out.println("La sumatoria de los valores de los dados dio impar en el lanzamiento N: " + lanzamientoImpar);
        }
    }
}
