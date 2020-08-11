import java.util.Scanner;

public class practica02AnioBiciesto {
    public static void main(String[] args) {
        int anio;
        boolean condicionBiciesto = true;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un año");
        anio = entrada.nextInt();

        while (anio % 4 == 0) {

            if (anio % 100 == 0) {
                if (anio % 400 == 0) {
                    condicionBiciesto = true;
                } else {
                    condicionBiciesto = false;
                }
            }

            if (!condicionBiciesto) {
                System.out.println("El año ingresado no es bisiesto");
            } else {
                System.out.println("El año ingresado es bisiesto");
            }

            System.out.println("Ingrese un año");
            condicionBiciesto = true;
            anio = entrada.nextInt();
        }

    }
}
