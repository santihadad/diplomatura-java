/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "PRACTICA05.java."

import java.io.*;

public class Practica05 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int multiplicacion;
		int resta;
		int suma;
		int x1;
		int x2;
		// Entrada de datos
		System.out.println("Ingrese un valor entero para X1");
		x1 = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese un valor entero para X2");
		x2 = Integer.parseInt(bufEntrada.readLine());
		// Proceso
		suma = x1 + x2;
		resta = x1 - x2;
		multiplicacion = x1 * x2;
		// Salida
		System.out.println("El resultado de X1 + X2 es: " + suma);
		System.out.println("El resultado de X1 - X2 es: " + resta);
		System.out.println("El resultado de X1 * X2 es: " + multiplicacion);
	}

}
