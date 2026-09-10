package Exercicios;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu tempo de contratação nesta empresa: ");
        int tempoContratacao = sc.nextInt();

        if (tempoContratacao >= 3) {
            System.out.println("Adesão ao plano de Saúde Disponível");
        } else {
            System.out.println("Adesão ao plano de Saúde Indisponível");
        }

        sc.close();
    }
}