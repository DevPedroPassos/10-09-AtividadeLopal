package Exercicios;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2. Ler salário
        System.out.print("Informe o salário do cliente: R$ ");
        double salario = scanner.nextDouble();

        // 3. Ler valor da parcela
        System.out.print("Informe o valor da parcela desejada: R$ ");
        double parcela = scanner.nextDouble();

        // 4. Verificar se parcela <= 30% do salário
        if (parcela <= (salario * 0.30)) {
            // 5. Exibir resultado
            System.out.println("Empréstimo APROVADO.");
        } else {
            System.out.println("Empréstimo RECUSADO. A parcela excede 30% do salário.");
        }

        scanner.close();
    }
}