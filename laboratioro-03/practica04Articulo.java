import java.util.Scanner;

public class practica04Articulo {
    public static void main(String[] args) {
        String articulo;
        int clave;
        double precio, precioFinal;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del articulo");
        articulo = entrada.next();
        System.out.println("Ingrese la clave: 1 o 2");
        clave = entrada.nextInt();

        if (clave == 1 || clave == 2) {
            System.out.println("Ingrese precio del articulo");
            precio = entrada.nextDouble();
            if (clave == 1) {
                precioFinal = precio * 0.9;
            } else {
                precioFinal = precio * 0.8;
            }

            System.out.println("|Articulo: " + articulo + " |Clave: " + clave + " |Precio inicial: $" + precio + " |Precio final: $" + precioFinal);

        } else {
            System.out.println("Error de clave, ingrese un valor valido");
        }

    }
}
