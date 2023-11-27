package Exercicios;

/*
    2 - Elaborar um algoritmo em Java que dado 3 valores A, B, C, exiba no console o
maior dos 3 valores e com a mensagem: "É o maior "
 */

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {

        int n1, n2, n3;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro numero inteiro:");
        n1 = input.nextInt();

        System.out.println("Informe o segundo numero inteiro:");
        n2 = input.nextInt();

        System.out.println("Informe o terceiro numero inteiro:");
        n3 = input.nextInt();

        if ((n1 > n2 ) && (n1 > n3)) {
            System.out.println(n1 + " É o maior");
        } else if ((n2 > n1) && (n2 > n3)) {
            System.out.println(n2 + " É o maior");
        } else if ((n3 > n1) && (n3 > n2)) {
            System.out.println(n3 + " É o maior");
        }
        input.close();
    }
}
