import java.util.Calendar;
import java.util.Scanner;

public class practica03anioNacimiento {
    public static void main(String[] args) {
        int anioNacimiento;
        int edadUsuario;
        int anioActual;
        anioActual = Calendar.getInstance().get(Calendar.YEAR);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su anio de nacimiento");
        anioNacimiento = entrada.nextInt();
        edadUsuario = anioActual - anioNacimiento;
        System.out.println("Tu edad es de: " + edadUsuario);
    }
}
