
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Santiago Hadad
 */
public class EjecutablePrimerJava {
    public static void main (String[] args){
    // Definir variables
    int dato;
    int cuadrado;
    Scanner entrada = new Scanner (System.in);
    // Entrada de datos
    System.out.println("Ingrese un numero entero");
    dato = entrada.nextInt();
    // Proceso
    cuadrado = dato*dato;
    // Salida
    System.out.println("El cuadrado del numero es: " + cuadrado);
    
    }
}
