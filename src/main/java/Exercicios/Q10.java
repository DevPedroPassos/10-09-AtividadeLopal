package Exercicios;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o salário do cliente: R$ ");
        double salario = scanner.nextDouble();


        System.out.print("Informe o valor da parcela desejada: R$ ");
        double parcela = scanner.nextDouble();

        if (parcela <= (salario * 0.30)) {
            // 5. Exibir resultado
            System.out.println("Empréstimo APROVADO.");
        } else {
            System.out.println("Empréstimo RECUSADO. A parcela excede 30% do salário.");
        }

        scanner.close();
    }
}