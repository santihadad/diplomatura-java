import java.util.Scanner;

public class practica06Embarcaciones {
    public static void main(String[] args) {
        int cantidadEmbarcaciones, tipoEmbarcacion, cuotaMensual, maximaCuotaMensual;
        String nombreEmbarcacion, nombreEmbarcacionMaxCuota;
        double valorPromedioPagado, totalAportadoVelero, totalAportadoLancha, totalAnualVeleros, totalAnualLanchas;
        totalAportadoVelero = totalAportadoLancha = 0;
        maximaCuotaMensual = 0;
        nombreEmbarcacionMaxCuota = "";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de embarcaciones para cargar sus datos");
        cantidadEmbarcaciones = entrada.nextInt();
        for (int i = 0; i < cantidadEmbarcaciones; i++) {

            System.out.println("Ingrese el tipo de embarcacion: 1 para velero, y 2 para lancha");
            tipoEmbarcacion = entrada.nextInt();
            System.out.println("Ingrese el nombre de la embarcacion");
            nombreEmbarcacion = entrada.next();
            System.out.println("Ingrese la cuota mensual de la embarcacion");
            cuotaMensual = entrada.nextInt();

            if (tipoEmbarcacion == 1 || tipoEmbarcacion == 2) {

                if (tipoEmbarcacion == 1) {
                    totalAportadoVelero = totalAportadoVelero + cuotaMensual;
                } else {
                    totalAportadoLancha = totalAportadoLancha + cuotaMensual;
                }
                if (cuotaMensual > maximaCuotaMensual) {
                    maximaCuotaMensual = cuotaMensual;
                    nombreEmbarcacionMaxCuota = nombreEmbarcacion;
                }

            } else {
                System.out.println("Tipo de embarcacion no valido");
                cantidadEmbarcaciones = cantidadEmbarcaciones - 1;
            }
        }

        totalAnualLanchas = totalAportadoLancha * 12;
        totalAnualVeleros = totalAportadoVelero * 12;

        valorPromedioPagado = (totalAportadoLancha + totalAportadoVelero) / cantidadEmbarcaciones;

        System.out.println("El total anual aportado por los veleros es de: $" + totalAnualVeleros + " y el total anual aportado por las lanchas es de: $" + totalAnualLanchas);
        System.out.println("El velero que mayor cuota paga es el: " + nombreEmbarcacionMaxCuota + " y paga un monto de: $" + maximaCuotaMensual);
        System.out.println("El valor promedio pagado mensualmente por las embaraciones es de: $" + valorPromedioPagado);
    }

}
