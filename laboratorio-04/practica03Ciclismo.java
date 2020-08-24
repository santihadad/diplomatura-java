import java.util.Arrays;
import java.util.Scanner;

public class practica03Ciclismo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float[] tiempos = new float[20];
        float tiempo, tiempoMenor, cantidadTiempos, promedioTiempos, acumuladorTiempos;
        int cantidadAbandonos;

        acumuladorTiempos = cantidadTiempos = 0;
        cantidadAbandonos = 0;
        tiempoMenor = 1000;

        for (int i = 0; i < 20; i++) {
            do {
                System.out.println("Ingrese tiempo de carrera");
                tiempo = entrada.nextInt();
            } while (tiempo < 0);

            tiempos[i] = tiempo;

            if (tiempos[i] > 0) {
                acumuladorTiempos += tiempos[i];
                cantidadTiempos += 1;
                if (tiempos[i] < tiempoMenor) {
                    tiempoMenor = tiempos[i];
                }
            }

            if (tiempos[i] == 0) {
                cantidadAbandonos += 1;
            }

        }
        Arrays.sort(tiempos, 0, 19);

        promedioTiempos = (acumuladorTiempos / cantidadTiempos);

        System.out.println("El promedio de tiempos es de: " + promedioTiempos + " minutos");
        System.out.println("La cantidad de abandonos fue de: " + cantidadAbandonos);
        System.out.println("El tiempo del ganador es de: " + tiempoMenor + " minutos");
        System.out.println(Arrays.toString(tiempos));
    }
}
