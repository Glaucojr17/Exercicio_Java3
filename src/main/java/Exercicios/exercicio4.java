package Exercicios;
/*
    4 – Escreva um algoritmo que leia um número e mostre uma mensagem indicando se
este número é par ou ímpar e se é positivo ou negativo.
*/

import java.util.Scanner;
public class exercicio4 {

    public static void main(String[] args) {

        int num1;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro numero inteiro:");
        num1 = input.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("O numero é PAR");
        } else {
            System.out.println("O numero é IMPAR");
        }
        if (num1 >= 0) {
            System.out.println("O numero é POSITIVO");
        } else {
            System.out.println("O numero é NEGATIVO");
        }

        input.close();
    }
}