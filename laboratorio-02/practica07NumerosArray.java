import java.util.Scanner;

public class practica07NumerosArray {
    public static void main(String[] args) {
        int numero3Cifras;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero de 3 cifras");
        numero3Cifras = entrada.nextInt();
        String str = Integer.toString(numero3Cifras);
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));


        }

    }
}
