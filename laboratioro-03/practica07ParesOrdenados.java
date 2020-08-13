import java.util.Scanner;

public class practica07ParesOrdenados {
    public static void main(String[] args) {
        int cantidadDePuntos, contadorPuntosPrimerCuadrante, contadorPuntosTercerCuadrante, ingresarMasPuntos;
        double distanciaActual, distanciaMayor, coordenadaX, coordenadaY, coordenadaXMayor, coordenadaYMayor;
        cantidadDePuntos = contadorPuntosPrimerCuadrante = contadorPuntosTercerCuadrante = 0;
        distanciaMayor = 0.0;
        coordenadaXMayor = coordenadaYMayor = 0.0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Desea ingresar puntos: coloque uno (1) para continuar o cero (0) para salir");
        ingresarMasPuntos = entrada.nextInt();
        while (ingresarMasPuntos == 1) {

            System.out.println("Ingrese las coordenadas de X");
            Scanner entrada1 = new Scanner(System.in);
            coordenadaX = entrada1.nextDouble();

            System.out.println("Ingrese las coordenadas de Y");
            Scanner entrada2 = new Scanner(System.in);
            coordenadaY = entrada2.nextDouble();

            cantidadDePuntos += 1;

            if (coordenadaX > 0 && coordenadaY > 0) {
                contadorPuntosPrimerCuadrante += 1;
            } else if (coordenadaX < 0 && coordenadaY < 0) {
                contadorPuntosTercerCuadrante += 1;
            }

            distanciaActual = Math.sqrt(Math.pow(coordenadaX, 2) + Math.pow(coordenadaY, 2));

            if (distanciaActual > distanciaMayor) {
                distanciaMayor = distanciaActual;
                coordenadaXMayor = coordenadaX;
                coordenadaYMayor = coordenadaY;
            }
            System.out.println("Desea ingresar mas puntos: coloque uno (1) para continuar o cero (0) para salir");
            ingresarMasPuntos = entrada.nextInt();
        }

        System.out.println("Ingresaste un total de: " + cantidadDePuntos + " puntos en el programa");
        System.out.println("Hay un total de: " + contadorPuntosPrimerCuadrante + " punto/s en el primer cuadrante");
        System.out.println("Hay un total de: " + contadorPuntosTercerCuadrante + " punto/s en el tercer cuadrante");
        System.out.println("El punto mas alejado se encuentra a una distancia de: " + distanciaMayor + " y tiene coordenadas en: (" + coordenadaXMayor + ";" + coordenadaYMayor + ")");
    }
}
