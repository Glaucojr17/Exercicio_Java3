package Exercicios;

import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            // Solicita ao usuário inserir 5 valores
            System.out.println("Insira 5 valores:");

            // Inicializa variáveis para armazenar o maior elemento e o número de vezes que aparece
            int maiorElemento = Integer.MIN_VALUE;
            int contadorMaiorElemento = 0;

            // Loop para obter os valores
            for (int i = 0; i < 5; i++) {
                System.out.print("Valor " + (i + 1) + ": ");
                int valor = input.nextInt ();

                // Verifica se o valor é maior que o atual maiorElemento
                if (valor > maiorElemento) {
                    maiorElemento = valor;
                    contadorMaiorElemento = 1;  // Reinicia o contador
                } else if (valor == maiorElemento) {
                    contadorMaiorElemento++;  // Incrementa o contador se o valor for igual ao maiorElemento
                }
            }

            // Exibe o maior elemento e o número de vezes que aparece
            System.out.println("\nMaior Elemento: " + maiorElemento);
            System.out.println("Número de vezes que o maior elemento aparece: " + contadorMaiorElemento);

            // Fecha o scanner
            input.close();
        }
    }
