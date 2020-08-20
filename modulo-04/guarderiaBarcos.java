import java.util.Scanner;

public class guarderiaBarcos {
    public static void main(String[] args) {

        // Declarar variables
        Scanner entrada = new Scanner(System.in);
        Scanner lectorCadena = new Scanner(System.in);
        int n, tipo; // Tipo es 1: | velero , 2: lancha
        String nombre, nombreMayor;
        float monto, acuVelero, acuLancha, montoMayor, cuotaPromedio;
        boolean primerVelero;

        // Inicializacion de variables
        acuLancha = acuVelero = 0;
        primerVelero = false;
        nombreMayor = "";
        montoMayor = 0;

        // Leer datos de entrada
        do {
            System.out.println("Ingrese la cantidad de embarcaciones a procesar");
            n = entrada.nextInt();
        } while (n <= 0);

        // Procesos
        for (int i = 0; i < n; i++) {
            // Leer datos de cada embarcacion
            System.out.println("Ingrese el nombre de la embarcacion");
            nombre = lectorCadena.nextLine();
            do {
                System.out.println("Ingrese el tipo de embarcacion -> 1: Velero | 2: Lancha");
                tipo = entrada.nextInt();
                if (tipo < 1 || tipo > 2) {
                    System.out.println("Valor incorrecto, ingrese 1 o 2");
                }
            } while (tipo < 1 || tipo > 2);

            System.out.println("Ingrese monto mensual de la cuota");
            monto = entrada.nextFloat();

            if (tipo == 1) {
                acuVelero += monto;
                if (primerVelero == false) {
                    nombreMayor = nombre;
                    montoMayor = monto;
                    primerVelero = true;
                } else if (monto > montoMayor) {
                    nombreMayor = nombre;
                    montoMayor = monto;
                }
            } else {
                acuLancha += monto;
            }

        }

        //Region donde mostramos resultados
        cuotaPromedio = (acuLancha + acuVelero) / n;

        System.out.println("Total anual recaudado por veleros: " + (acuVelero * 12));
        System.out.println("Total anual recaudado por lanchas: " + (acuLancha * 12));

        if (primerVelero) {
            System.out.println("El nombre del velero con la mayor cuota es: " + nombreMayor);
            System.out.println("Siendo el monto de: $" + montoMayor);
        }

        System.out.println("Cuota mensual promedio: $" + cuotaPromedio);
    }
}