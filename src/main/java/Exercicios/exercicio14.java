package Exercicios;
/*
Faça um programa que dado 5 valores imprima o maior e o menor entre eles
 */
import java.util.Scanner;
public class exercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitar ao usuário para inserir 5 valores
        System.out.println("Digite 5 valores:");

        int[] valores = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valores[i] = input.nextInt();
        }

        // Encontrar o maior e o menor valor
        int maior = valores[0];
        int menor = valores[0];

        for (int i = 1; i < 5; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
            }

            if (valores[i] < menor) {
                menor = valores[i];
            }
        }

        // Exibir o maior e o menor valor
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);

        input.close();
    }
}
