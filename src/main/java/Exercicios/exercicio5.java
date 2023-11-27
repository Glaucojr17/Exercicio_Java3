package Exercicios;
/*
5 - Elaborar um algoritmo em Java que dado dois valores e exiba no console uma das três
mensagens a seguir:
‘Números iguais’, caso os números sejam iguais
‘Primeiro é maior’, caso o primeiro seja maior que o segundo
‘Segundo maior’, caso o segundo seja maior que o primeiro.
 */
import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {

        int v1, v2;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro numero inteiro:");
        v1 = input.nextInt();

        System.out.println("Informe o segundo numero inteiro:");
        v2 = input.nextInt();

        if (v1 == v2) {
            System.out.println("Numeros Iguais");
        } else if (v1 > v2) {
            System.out.println(" Primeiro é maior");
        } else {
            System.out.println("Segundo é maior");
        }

        input.close();}
}
