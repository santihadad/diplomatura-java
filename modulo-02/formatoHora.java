
import java.util.Scanner;

public class formatoHora {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String am_pm;
        int horas, minutos, hh12;
        System.out.println("Ingrese horas [Formato 24]");
        horas = entrada.nextInt();
        System.out.println("Ingrese minutos [Formato 24]");
        minutos = entrada.nextInt();
        hh12 = horas;
        if (horas >= 12) {
            if (horas > 12) {
                hh12 = horas - 12;
            }
            am_pm = "PM";
            if (horas == 24 && minutos == 0) {
                am_pm = "AM";
            }
        } else {
            am_pm = "AM";
            if (horas == 0 && minutos == 0) {
                hh12 = hh12 + 12;
            }
        }
        System.out.println("La hora en formato 12 es: " + hh12 + ":" + minutos + am_pm);
    }
}
