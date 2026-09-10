import java.util.Scanner;

public class ControleEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o nome do participante " + i + ": ");
            String nome = scanner.nextLine();

            System.out.println("Entrada registrada! Bem-vindo(a) ao evento corporativo, " + nome + ".");
            System.out.println("---");
        }

        scanner.close();
    }
}