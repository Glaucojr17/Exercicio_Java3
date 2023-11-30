package Exercicios;
/*
Faça um programa que dado um valor A, calcule a soma de todos os números
pares e o produto de todos os números ímpares até chegar no valor A.
 */
import java.util.Scanner;
public class exercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor A: ");
        int valorA = input.nextInt();

        int somaPares = 0;
        long produtoImpares = 1; // Inicializado como 1 para não afetar a multiplicação

        for (int i = 1; i <= valorA; i++) {
            if (i % 2 == 0) {
                // Número par
                somaPares += i;
            } else {
                // Número ímpar
                produtoImpares *= i;
            }
        }

        System.out.println("Soma de números pares até " + valorA + ": " + somaPares);
        System.out.println("Produto de números ímpares até " + valorA + ": " + produtoImpares);

        input.close();
    }
}
