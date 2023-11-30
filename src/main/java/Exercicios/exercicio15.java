package Exercicios;
/*
Escreva um algoritmo em Java que exiba no console os 15 primeiros números da série
Fibonacci: 1, 1, 2, 3, 5, 8, 13
 */
public class exercicio15 {
    public static void main(String[] args) {
        int n = 15; // Número de termos desejados

        System.out.println("Os primeiros " + n + " números da série Fibonacci:");

        int primeiroTermo = 1;
        int segundoTermo = 1;

        System.out.print(primeiroTermo + ", " + segundoTermo);

        for (int i = 3; i <= n; i++) {
            int proximoTermo = primeiroTermo + segundoTermo;
            System.out.print(", " + proximoTermo);

            // Atualizando os termos para o próximo passo na sequência
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
    }
}
