package Exercicios;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("O funcionário utiliza veículo próprio para trabalhar? (S/N): ");
        String resposta = sc.nextLine();

        if (resposta.equalsIgnoreCase("S")) {
            System.out.println("Ele pode solicitar auxílio combustível.");
        } else {
            System.out.println("Não tem direito ao auxílio combustível.");
        }

        sc.close();
    }
}