import java.util.Scanner;

public class practica04Cajero {
    public static void main(String[] args) {
        int billeteMil;
        int billeteQuinientos;
        int billeteDoscientos;
        int billeteCien;
        int monto;
        System.out.println("Ingrese el monto de extraccion");
        Scanner entrada = new Scanner(System.in);
        monto = entrada.nextInt();
        if (monto % 100 == 0) {
            billeteMil = monto / 1000;
            billeteQuinientos = (monto % 1000) / 500;
            billeteDoscientos = ((monto % 1000) % 500) / 200;
            billeteCien = (((monto % 1000) % 500) % 200) / 100;

            System.out.println("El numero de billetes es: " + billeteMil + " billetes de $1000, " + billeteQuinientos + " billetes de $500, " + billeteDoscientos + " billetes de $200, y " + billeteCien + " billetes de $100");
        } else {
            System.out.println("El valor ingresado no es valido");
        }
    }
}
