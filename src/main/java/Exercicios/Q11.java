package Exercicios;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor investido pelo cliente: R$ ");
        double investimento = scanner.nextDouble();

        if (investimento <= 10000) {
            System.out.println("Classificação: Bronze");
        } else if (investimento <= 50000) {
            System.out.println("Classificação: Prata");
        } else if (investimento <= 100000) {
            System.out.println("Classificação: Ouro");
        } else {
            System.out.println("Classificação: Platinum");
        }

        scanner.close();
    }
}