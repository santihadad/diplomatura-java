
import java.util.Scanner;

public class cuadradoNumero {
    public static void main (String[] args){
    // Definir variables
    int dato;
    int cuadrado;
    Scanner entrada = new Scanner (System.in);
    // Entrada de datos
    System.out.println("Ingrese un numero entero");
    dato = entrada.nextInt();
    // Proceso
    cuadrado = dato*dato;
    // Salida
    System.out.println("El cuadrado del numero es: " + cuadrado);
    
    }
}
