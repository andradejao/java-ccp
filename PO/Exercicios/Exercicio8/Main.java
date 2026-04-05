package main;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int opcao;
    static Analista a1;
    static Programador p1;

    public static void main(String[] args) {
        do {
            System.out.println("\n--- Criar Objeto ---");
            System.out.println("1 - Analista");
            System.out.println("2 - Programador");
            System.out.println("3 - Imprimir Dados");
            System.out.println("9 - Encerrar");
            opcao = sc.nextInt();
            sc.nextLine(); // limpa buffer

            if (opcao == 1) {
                criarAnalista();
            } else if (opcao == 2) {
                criarProgramador();
            } else if (opcao == 3) {
                System.out.println("");
                System.out.println("1 - Imprimir Analista");
                System.out.println("2 - Imprimir Programador");
                int subOpcao = sc.nextInt();
                sc.nextLine(); // limpa buffer
                imprimirDados(subOpcao);
            } else if (opcao != 9) {
                System.out.println("Opção invalida!");
            }
        } while (opcao != 9);

    }

    static public void criarAnalista() {
        // Aqui coleta os dados pelo Scanf e adiciona nas variáveis
        System.out.println("\n--- Analista ---");
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Matricula: ");
        String matricula = sc.nextLine();
        System.out.println("Quantidade de Projetos: ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        float[] valorPorProjeto = new float[quantidade];
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Valor do Projeto " + (i + 1) + ": ");
            valorPorProjeto[i] = sc.nextFloat();
        }
        sc.nextLine(); // limpa buffer. corrige bug
        // Criando o objeto 
        a1 = new Analista(nome, matricula, valorPorProjeto);
    }

    static public void criarProgramador() {
        // Aqui coleta os dados pelo Scanf e adiciona nas variáveis
        System.out.println("\n--- Programador ---");
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Matricula: ");
        String matricula = sc.nextLine();
        System.out.println("Valor da Hora: ");
        float valorHora = sc.nextFloat();
        sc.nextLine();
        System.out.println("Quantidade de Horas: ");
        float quantidadeHoras = sc.nextFloat();
        sc.nextLine();
        // Criando o objeto 
        p1 = new Programador(quantidadeHoras, valorHora, nome, matricula);
    }

    static public void imprimirDados(int opcao) {
        if (opcao == 1) {
            System.out.println("\n--- Analista ---");
            System.out.println("Nome: " + a1.nome);
            System.out.println("Matricula: " + a1.matricula);
            System.out.println("Salario: R$ " + a1.calculaSalario());
        } else if (opcao == 2) {
            System.out.println("\n--- Programador ---");
            System.out.println("Nome: " + p1.nome);
            System.out.println("Matricula: " + p1.matricula);
            System.out.println("Salario: R$ " + p1.calculaSalario());
        } else {
            System.out.println("Opção invalida!");
        }
    }
}
