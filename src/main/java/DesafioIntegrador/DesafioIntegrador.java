import java.util.Scanner;

public class DesafioIntegrador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do colaborador: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        System.out.print("Salario: ");
        double salario = scanner.nextDouble();

        System.out.print("Tempo de empresa (em anos): ");
        int tempoEmpresa = scanner.nextInt();

        System.out.print("Quantidade de filhos: ");
        int quantidadeFilhos = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Modalidade de trabalho (presencial ou home office): ");
        String modalidade = scanner.nextLine();

        System.out.print("Utiliza veiculo proprio (sim/nao): ");
        String utilizaVeiculo = scanner.nextLine();

        boolean direitoValeAlimentacao = true;
        boolean direitoAuxilioCreche = quantidadeFilhos > 0;
        boolean elegivelPlanoSaude = true;
        boolean direitoAuxilioHomeOffice = modalidade.equalsIgnoreCase("home office");
        boolean direitoAuxilioCombustivel = modalidade.equalsIgnoreCase("presencial") && utilizaVeiculo.equalsIgnoreCase("sim");
        boolean participacaoPlr = tempoEmpresa >= 1;
        boolean elegivelBolsaEstudos = tempoEmpresa >= 2;

        System.out.println("\n--- Resumo de Beneficios: " + nome + " ---");
        System.out.println("Direito ao vale-alimentacao: " + (direitoValeAlimentacao ? "Sim" : "Nao"));
        System.out.println("Direito ao auxilio-creche: " + (direitoAuxilioCreche ? "Sim" : "Nao"));
        System.out.println("Elegibilidade para plano de saude: " + (elegivelPlanoSaude ? "Sim" : "Nao"));
        System.out.println("Direito ao auxilio home office: " + (direitoAuxilioHomeOffice ? "Sim" : "Nao"));
        System.out.println("Direito ao auxilio combustivel: " + (direitoAuxilioCombustivel ? "Sim" : "Nao"));
        System.out.println("Participacao na PLR: " + (participacaoPlr ? "Sim" : "Nao"));
        System.out.println("Elegibilidade para bolsa de estudos: " + (elegivelBolsaEstudos ? "Sim" : "Nao"));

        scanner.close();
    }
}