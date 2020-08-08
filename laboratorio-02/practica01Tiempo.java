import java.util.Scanner;

public class practica01Tiempo {
    public static void main(String[] args) {
        int dato;
        double horas;
        double minutos;
        double segundos;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de segundos transcurridos");
        dato = entrada.nextInt();
        horas = dato / 3600;
        minutos = (dato % 3600) / 60;
        segundos = ((dato % 3600) % 60);
        System.out.println("Han pasado " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos");
    }
}
