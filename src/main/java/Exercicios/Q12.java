package Exercicios;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a renda mensal do cliente: R$ ");
        double renda = scanner.nextDouble();

        System.out.print("Informe o score de crédito do cliente: ");
        int score = scanner.nextInt();

        if (renda > 8000 && score > 700) {
            System.out.println("Cartão Premium APROVADO.");
        } else {
            System.out.println("Cartão Premium RECUSADO.");
        }

        scanner.close();
    }
}