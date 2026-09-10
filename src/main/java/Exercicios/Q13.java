package Exercicios;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Informe o valor da transação: R$ ");
        double valor = scanner.nextDouble();


        if (valor > 10000) {
            System.out.println("ALERTA: Transação SUSPEITA. Sinalizada para análise.");
        } else {
            System.out.println("Transação normal. Não requer análise.");
        }

        scanner.close();
    }
}