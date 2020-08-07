import java.util.Scanner;

public class practica06Triangulo {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double sp;
        double area;
        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Ingrese el lado A del triangulo");
        a = entrada1.nextDouble();
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Ingrese el lado B del triangulo");
        b = entrada2.nextDouble();
        Scanner entrada3 = new Scanner(System.in);
        System.out.println("Ingrese el lado C del triangulo");
        c = entrada3.nextDouble();
        sp = (a+b+c)/2;
        area = Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
        System.out.println("El area del trinangulo es de: " + area);
    }
}
