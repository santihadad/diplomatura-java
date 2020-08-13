public class practica03JuegoCartas {
    public static void main(String[] args) {
        int contadorRondas, puntajeJugador1, puntajeJugador2, cartaJugador1, cartaJugador2, paloJugador1, paloJugador2;
        String paloJugador1Texto, paloJugador2Texto;
        contadorRondas = 1;
        puntajeJugador1 = puntajeJugador2 = 0;
        paloJugador1Texto = paloJugador2Texto = "";
        while (contadorRondas <= 2) {

            System.out.println("Ronda N: " + contadorRondas);

            paloJugador1 = (int) (Math.random() * 4 + 1);
            cartaJugador1 = (int) (Math.random() * 12 + 1);
            paloJugador2 = (int) (Math.random() * 4 + 1);
            cartaJugador2 = (int) (Math.random() * 12 + 1);

            switch (paloJugador1) {
                case 1:
                    paloJugador1Texto = "Copa";
                    break;
                case 2:
                    paloJugador1Texto = "Basto";
                    break;
                case 3:
                    paloJugador1Texto = "Espada";
                    break;
                case 4:
                    paloJugador1Texto = "Oro";
                    break;
            }

            switch (paloJugador2) {
                case 1:
                    paloJugador2Texto = "Copa";
                    break;
                case 2:
                    paloJugador2Texto = "Basto";
                    break;
                case 3:
                    paloJugador2Texto = "Espada";
                    break;
                case 4:
                    paloJugador2Texto = "Oro";
                    break;
            }

            if (cartaJugador1 > cartaJugador2) {
                puntajeJugador1 = puntajeJugador1 + cartaJugador1;
            } else if (cartaJugador1 < cartaJugador2) {
                puntajeJugador2 = puntajeJugador2 + cartaJugador2;
            } else {
                if (paloJugador1 == 4 && paloJugador2 != 4) {
                    puntajeJugador1 = puntajeJugador1 + cartaJugador1;
                } else if (paloJugador2 == 4 && paloJugador1 != 4) {
                    puntajeJugador2 = puntajeJugador2 + cartaJugador2;
                } else {
                    puntajeJugador1 = puntajeJugador1 + cartaJugador1;
                    puntajeJugador2 = puntajeJugador2 + cartaJugador2;
                }

            }

            if (contadorRondas == 1) {
                System.out.println("En la primer ronda las cartas fueron: " + cartaJugador1 + " de " + paloJugador1Texto + " para el Jugador 1, y " + cartaJugador2 + " de " + paloJugador2Texto + " para el Jugador 2");
                System.out.println("Los puntos en la primera ronda son: " + puntajeJugador1 + " para el Jugador 1, y " + puntajeJugador2 + " para el Jugador 2");
            }
            if (contadorRondas == 2) {
                System.out.println("En la segunda ronda las cartas fueron: " + cartaJugador1 + " de " + paloJugador1Texto + " para el Jugador 1, y " + cartaJugador2 + " de " + paloJugador2Texto + " para el Jugador 2");
                System.out.println("Los puntos acumulados de la segunda ronda son: " + puntajeJugador1 + " para el Jugador 1, y " + puntajeJugador2 + " para el Jugador 2");
            }

            contadorRondas += 1;
        }

        System.out.println("FIN DE LAS RONDAS");
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
