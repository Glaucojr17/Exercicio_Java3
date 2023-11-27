package Exercicios;
/*
6 - Elaborar um algoritmo em Java para calcular o IMC ideal de uma pessoa. Tendo
como dados de entrada a altura e o sexo utilizando as seguintes fórmulas:
- para homens: (72.7*h)-58
- para mulheres: (62.1*h)-44.7
Exiba o resultado no console
 */
import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {

        double alt, mnc;
        int sexo;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe primeiro sua altura (ex: 1.78): ");
        alt = input.nextDouble();

        System.out.println("Informe o seu sexo (1 para Masculino e 2 para Feminino): ");
        sexo = input.nextInt();

        if (sexo == '1') {
            mnc = ((72.7 * alt) - 58);
            System.out.println("O seu peso ideal e: "mnc);
        } else {
            mnc = ((62.1 * alt) - 44.7);
            System.out.println("O seu peso ideal é: "mnc);
        }

        input.close();
    }