import java.util.Scanner;

public class practica3_1NumerosParImpar {
    public static void main(String[] args) {
        int num, contadorPares, contadorImpares, anterior;
        boolean paso_cero, avisoParImpar;
        contadorPares = contadorImpares = anterior = 0;
        paso_cero = false;
        avisoParImpar = true;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero entero, finaliza con negativo");
        num = entrada.nextInt();
        while (num >= 0) {
            if (num != 0) {
                if (num % 2 == 0) {
                    contadorPares = contadorPares + 1;
                    if (anterior % 2 == 0 && anterior != 0) {
                        avisoParImpar = false;
                    }
                } else {
                    contadorImpares = contadorImpares + 1;
                    if (anterior % 2 != 0 && anterior != 0) {
                        avisoParImpar = false;
                    }

                }

            } else {
                paso_cero = true;
                avisoParImpar = false;
            }
            anterior = num;
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
