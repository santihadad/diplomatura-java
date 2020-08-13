public class practica03JuegoCartas {
    public static void main(String[] args) {
        int contadorRondas, puntajeJugador1, puntajeJugador2, cartaJugador1, cartaJugador2;
        contadorRondas = 1;
        puntajeJugador1 = puntajeJugador2 = 0;
        while (contadorRondas <= 2) {

            System.out.println("Ronda N: " + contadorRondas);

            cartaJugador1 = (int) (Math.random() * 4 + 1);

            cartaJugador2 = (int) (Math.random() * 4 + 1);

            switch (cartaJugador1) {
                case 1:
                    System.out.println("El jugador 1 tiene Copa");
                    break;
                case 2:
                    System.out.println("El jugador 1 tiene Basto");
                    break;
                case 3:
                    System.out.println("El jugador 1 tiene Espada");
                    break;
                case 4:
                    System.out.println("El jugador 1 tiene Oro");
                    break;
            }

            switch (cartaJugador2) {
                case 1:
                    System.out.println("El jugador 2 tiene Copa");
                    break;
                case 2:
                    System.out.println("El jugador 2 tiene Basto");
                    break;
                case 3:
                    System.out.println("El jugador 2 tiene Espada");
                    break;
                case 4:
                    System.out.println("El jugador 2 tiene Oro");
                    break;
            }
            puntajeJugador1 += cartaJugador1;
            puntajeJugador2 += cartaJugador2;

            contadorRondas += 1;
        }

        System.out.println("FIN RONDAS");
        System.out.println("Puntaje Jugador 1: " + puntajeJugador1);
        System.out.println("Puntaje Jugador 2: " + puntajeJugador2);

        if (puntajeJugador1 > puntajeJugador2) {
            System.out.println("GANA Jugador 1");
        } else if (puntajeJugador1 < puntajeJugador2) {
            System.out.println("GANA Jugador 2");
        } else {
            System.out.println("Hay un empate");
        }
    }
}
