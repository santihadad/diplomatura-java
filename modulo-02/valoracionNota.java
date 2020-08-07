import java.util.Scanner;

public class valoracionNota {
    public static void main(String[] args) {
        /*
        Dada cierta calificacion, debemos devolver un texto con la nota:
        1-Excelente
        2-Muy Buena
        3-Recomendable
        Otra- Valor no permitido
         */
        Scanner entrada = new Scanner(System.in);
        short calificacion;
        String valoracion;
        System.out.println("Ingrese la calificacion de la app");
        calificacion = entrada.nextShort();
        // Condicional Multiple
        switch (calificacion) {
            case 1: {
                valoracion = "Calificacion REGULAR";
                break;
            }
            case 2: {
                valoracion = "Calificacion MUY BUENA";
                break;
            }
            case 3: {
                valoracion = "Calificacion RECOMENDADA";
                break;
            }
            default: {
                valoracion = "El valor ingresado no esta permitido";
            }


        }
        System.out.println(valoracion);
    }
}
