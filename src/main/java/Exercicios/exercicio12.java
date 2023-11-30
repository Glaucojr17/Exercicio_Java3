package Exercicios;
/*
Faça um algoritmo que recebendo um número entre 1 a 7 mostre no console o
respectivo dia da semana. Exemplo: 1 – Domingo, 2 – Segunda
 */
import java.util.Scanner;
public class exercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int numero = input.nextInt();

        String diaDaSemana = obterDiaDaSemana(numero);

        if (diaDaSemana != null) {
            System.out.println("O dia correspondente ao número " + numero + " é " + diaDaSemana);
        } else {
            System.out.println("Número inválido. Por favor, digite um número de 1 a 7.");
        }

        input.close();
    }

    public static String obterDiaDaSemana(int numero) {
        switch (numero) {
            case 1:
                return "Domingo";
            case 2:
                return "Segunda-feira";
            case 3:
                return "Terça-feira";
            case 4:
                return "Quarta-feira";
            case 5:
                return "Quinta-feira";
            case 6:
                return "Sexta-feira";
            case 7:
                return "Sábado";
            default:
                return null;
        }
    }

}
