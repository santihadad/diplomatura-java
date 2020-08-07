import java.util.Scanner;

public class Practica05Esfera {
    public static void main(String[] args) {
        // Leer un dato de entrada (radio) y calcular el volumen de esfera
        double radio;
        double volumenEsfera;
        double diametro;
        double cuatroTercios;
        cuatroTercios = 1.67;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el radio de la esfera");
        radio = entrada.nextDouble();
        diametro = radio*2;
        volumenEsfera = cuatroTercios * Math.PI * Math.pow(radio, 3);
        System.out.println("El volumen de la esfera es de: " + volumenEsfera + " y el diametro es de " + diametro);
    }
}
