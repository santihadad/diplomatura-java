import java.io.IOException;
import java.util.Scanner;

public class practica3_2Robot {

    public static void main(String args[]) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int opcionElegida;
        int posicionx;
        int posiciony;
        // Inicializamos la posicion del robot
        posicionx = (int) (Math.random() * 100);
        posiciony = (int) (Math.random() * 100);
        do {
            System.out.println("TITO esta en (" + posicionx + ";" + posiciony + ")");
            System.out.println("1.Girar al norte y avanzar 10 pasos");
            System.out.println("2.Girar al sur y avanzar 20 pasos");
            System.out.println("3.Girar al este y avanzar 10 pasos");
            System.out.println("4.Girar al oeste y avanzar 20 pasos");
            System.out.println("5.Salir");
            // Leer opcion que eliga usuario
            opcionElegida = entrada.nextInt();
            switch (opcionElegida) {
                case 1:
                    posiciony = posiciony + 10;
                    break;
                case 2:
                    posiciony = posiciony - 20;
                    break;
                case 3:
                    posicionx = posicionx + 10;
                    break;
                case 4:
                    posicionx = posicionx - 20;
                    break;
                case 5:
                    System.out.println("Programa finalizado, adios TITO");
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta: 1,2,3,4 o 5");
            }
        } while (opcionElegida != 5);
    }
}
