package Exercicios;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o saldo médio mensal do cliente: R$ ");
        double saldoMedio = scanner.nextDouble();

        if (saldoMedio > 5000) {
            System.out.println("Cliente possui direito à ISENÇÃO de tarifa bancária.");
        } else {
            System.out.println("Tarifa bancária MANTIDA.");
        }

        scanner.close();
    }
}