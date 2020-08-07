import java.util.Scanner;

public class practica05Esfera {
    public static void main(String[] args) {
        // Leer un dato de entrada (radio) y calcular el volumen de esfera
        double radio;
        double volumenEsfera;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        radio = entrada.nextDouble();
        volumenEsfera =(4.0/3.0)*Math.PI * Math.pow(radio, 3);
        System.out.println("El volumen de la esfera es de: " + volumenEsfera);
    }
}
