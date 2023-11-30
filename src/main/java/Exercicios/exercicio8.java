package Exercicios;
/*
Escreva um algoritmo em Java para exibir no console os números múltiplos de 5 do
intervalo de 1 a 50
 */

public class exercicio8 {
           public static void main(String[] args) {
            // Rodar a contagem de 1 a 50
            for (int i = 1; i <= 50; i++) {
                // Verifica se o número é múltiplo de 5
                if (i % 5 == 0) {
                    // Exibe o número no console
                    System.out.println("Segue os numeros multiplos de 5 > " + (i));
                }
            }
        }
    }
