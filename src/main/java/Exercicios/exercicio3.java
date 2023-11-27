package Exercicios;
/*
    3 - Elaborar um algoritmo em Java que dado 2 valores A e B e os exibam no console com
a mensagem: "São múltiplos" ou "Não são múltiplos".
 */

import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {

        int v1, v2;
        int resul;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro numero inteiro:");
        v1 = input.nextInt();

        System.out.println("Informe o segundo numero inteiro:");
        v2 = input.nextInt();

        resul = v2 / v1;

        if (resul % 2 == 0) {
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }

        input.close();
    }
}