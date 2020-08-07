
import java.util.Scanner;

public class numeroPar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leer un numero y ver si es par o impar
        int num;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el numero");
        num = entrada.nextInt();

        if (num % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero no es par");
        }
    }

}
