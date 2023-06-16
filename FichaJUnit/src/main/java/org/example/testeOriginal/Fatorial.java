package org.example.testeOriginal;

public class Fatorial {

        public static int calcular(int numero) {
            if (numero < 0) {
                throw new IllegalArgumentException("O número não pode ser negativo.");
            }

            int resultado = 1;
            for (int i = 1; i <= numero; i++) {
                resultado *= i;
            }

            return resultado;
        }
    }

