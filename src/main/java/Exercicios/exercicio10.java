package Exercicios;
/*
Escreva um algoritmo em Java que dado um número inteiro N exiba no console todos
os valores pares entre 1 (inclusive) e N (inclusive). Considere que o N será sempre maior que
ZERO.
 */
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro : ");
        int n = input.nextInt();

        System.out.println("Valores pares entre 1 e " + n + ":");

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        input.close();
    }
}
