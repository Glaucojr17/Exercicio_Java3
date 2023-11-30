package Exercicios;
/*
Escreva um algoritmo em Java que calcule e exiba no console a tabuada do 7 (1 a
10). No console deverá ser impresso
 */
public class exercicio11 {
    public static void main(String[] args) {
        int numero = 7;

        System.out.println("Tabuada do 7:");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
