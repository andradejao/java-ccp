package projetoexercicioaula05;

import java.util.Scanner;
import java.time.LocalDate;

public class ProjetoExercicioAula05 {

//   static para liberar uso para outras funções
    static int opcao;
    static Scanner sc = new Scanner(System.in);
    static Aluno a1 = new Aluno();
    static int anoCorrente = LocalDate.now().getYear();

    public static void main(String[] args) {
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Incluir Dados");
            System.out.println("2 - Alterar Dados");
            System.out.println("3 - Imprimir Dados");
            System.out.println("9 - Sair");
            System.out.println("\nDigite a opcao desejada: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Corrigir bug
            switch (opcao) {
                case 1:
                    incluirDados();
                    break;
                case 2:
                    alterarDados();
                    break;
                case 3:
                    imprimirDados();
                    break;
                case 9:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opcao invalida. Digite novamente!");
                    break;
            }
        } while (opcao != 9);
    }

    public static void incluirDados() {
        System.out.println("\n--- Inclua os Dados ---");
        System.out.println("Nome: ");
        a1.setNome(sc.nextLine());
        System.out.println("RGM: ");
        a1.setRgm(sc.nextInt());
        sc.nextLine(); // corrigir bug
        System.out.println("Ano de Nascimento: ");
        a1.setAnoNascimento(sc.nextInt());
        System.out.println("Mensalidade: ");
        a1.setValorMensalidade(sc.nextFloat());
    }

    public static void alterarDados() {
        System.out.println("\n--- Altere os Dados ---");
        System.out.println("Digite a opcao desejada:");
        System.out.println("1 - Alterar Nome");
        System.out.println("2 - Alterar RGM");
        System.out.println("3 - Alterar Ano de Nascimento");
        System.out.println("4 - Alterar Mensalidade");
        System.out.println("9 - Sair");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                sc.nextLine(); // Corrigir bug
                System.out.println("Novo Nome: ");
                a1.setNome(sc.nextLine());
                break;
            case 2:
                System.out.println("Novo RGM: ");
                a1.setRgm(sc.nextInt());
                break;
            case 3:
                System.out.println("Novo Ano de Nascimento: ");
                a1.setAnoNascimento(sc.nextInt());
                break;
            case 4:
                System.out.println("Nova Mensalidade: ");
                a1.setValorMensalidade(sc.nextFloat());
                break;
            case 9:
                System.out.println("Encerrando...");
                break;
            default:
                System.out.println("Opcao invalida!");
        }
    }

    public static void imprimirDados() {
        System.out.println("\n--- Dados do Aluno ---");
        System.out.println("Nome: " + a1.getNome());
        System.out.println("RGM: " + a1.getRgm());
        System.out.println("Ano de Nascimento: " + a1.getAnoNascimento());
        System.out.println("Mensalidade: " + a1.getValorMensalidade());
        System.out.println("Idade: " + a1.calculoIdade(anoCorrente));
    }
}
