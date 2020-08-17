import java.util.Scanner;

public class practica04CajeroRefactor {
    public static void main(String[] args) {
        int billetes1000, billetes500, billetes200, billetes100, dineroParaExtraer, resto1000, resto500, resto200;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dinero para extraer");
        dineroParaExtraer = entrada.nextInt();

        billetes1000 = dineroParaExtraer / 1000;
        resto1000 = dineroParaExtraer % 1000;
        billetes500 = resto1000 / 500;
        resto500 = resto1000 % 500;
        billetes200 = resto500 / 200;
        resto200 = resto500 % 200;
        billetes100 = resto200 / 100;

        System.out.println("Vas a extraer " + billetes1000 + " billetes de $1000, " + billetes500 + " billetes de $500, " + billetes200 + " billetes de $200 y " + billetes100 + " billetes de $100");
    }
}
