package Exercicios;

/*
    1 - Faça um algoritmo em Java para calcular a média aritmética das 3 notas de um aluno e
mostre, além do valor da média, uma mensagem de "Aprovado", caso a média seja igual ou
superior a 6, ou a mensagem "Reprovado", caso contrário. Exiba os resultados no console.
 */

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

        double n1, n2, n3;
        double mda;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a primeira nota:");
        n1 = input.nextDouble();

        System.out.println("Informe a segunda nota:");
        n2 = input.nextDouble();

        System.out.println("Informe a terceira nota:");
        n3 = input.nextDouble();

        mda = (n1 + n2 + n3 ) / 3;

        if (mda >= 6 ) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        System.out.println("Media do aluno foi: " + mda);
        input.close();
    }
}

