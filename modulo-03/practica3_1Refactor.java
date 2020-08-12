import java.util.Scanner;

public class practica3_1Refactor {
    public static void main(String[] args) {
        int num, contadorPares, contadorImpares;
        boolean paso_cero, avisoParImpar, anterior, paridad;
        contadorPares = contadorImpares = 0;
        paso_cero = false;
        avisoParImpar = true;
        anterior = false;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero entero, finaliza con negativo");
        num = entrada.nextInt();
        while (num >= 0) {
            paridad = num % 2 == 0;
            if (paridad == true) {
                contadorPares = contadorPares + 1;
            } else {
                contadorImpares = contadorImpares + 1;
            }
            if (num == 0) {
                paso_cero = true;
            }
            if (paridad == anterior) {
                avisoParImpar = false;
            }
            anterior = paridad;
            System.out.println("Ingrese un numero entero, finaliza con negativo");
            num = entrada.nextInt();
        }
        System.out.println("Cantidad de pares: " + contadorPares + " y de impares: " + contadorImpares);

        if (paso_cero == true) {
            System.out.println("Paso al meno un cero");
        }
        if (avisoParImpar == true) {
            System.out.println("Paso una secuencia de par-impar-par-impar");
        }
    }
}
