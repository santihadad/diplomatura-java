
import java.util.Arrays;
import java.util.Scanner;

public class practica01NumerosPorTeclado {
    public static void main(String[] args) {
        int numeros[] = new int[10];
        float mediaPositivos, mediaNegativos;
        float acumuladorPositivos, acumuladorNegativos, cantidadPositivos, cantidadNegativos;
        acumuladorNegativos = acumuladorPositivos = cantidadPositivos = cantidadNegativos = 0;
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero entero");
            numeros[i] = entrada.nextInt();
            if (numeros[i] > 0) {
                acumuladorPositivos += numeros[i];
                cantidadPositivos += 1;
            } else if (numeros[i] < 0) {
                acumuladorNegativos += numeros[i];
                cantidadNegativos += 1;
            }
        }

        mediaNegativos = (acumuladorNegativos / cantidadNegativos);
        mediaPositivos = (acumuladorPositivos / cantidadPositivos);

        System.out.println("La media de los valores positivos es: " + mediaPositivos);
        System.out.println("La media de los valores negativos es: " + mediaNegativos);
        System.out.println("Los numeros del array son: " + Arrays.toString(numeros));
    }
}
