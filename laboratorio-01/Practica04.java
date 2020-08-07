/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "PRACTICA04.java."

import java.io.*;

public class Practica04 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double gasto;
		int km;
		int kml;
		double lts;
		double pr;
		// Entrada:
		System.out.println("Ingrese Km recoriddos");
		km = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese relacion Km por litro");
		kml = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese precio de combustible por litro");
		pr = Double.parseDouble(bufEntrada.readLine());
		// Proceso
		lts = km / kml;
		gasto = lts * pr;
		// Salida
		System.out.println("Total de litros consumidos: " + lts);
		System.out.println("Gasto total en pesos: " + gasto);
	}

}
