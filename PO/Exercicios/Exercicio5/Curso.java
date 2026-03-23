package exercicio;

import java.util.Scanner;

public class Curso {

    String nome;
    int quantidadeAlunos;
    String turma;
    float mensalidade;

    public Curso(String nome, int quantidadeAlunos, String turma, float mensalidade) {
        this.nome = nome;
        this.quantidadeAlunos = quantidadeAlunos;
        this.turma = turma;
        this.mensalidade = mensalidade;
    }

    public Curso() {
    }

    public void cadastraCurso() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do Curso: ");
        nome = sc.nextLine();
        System.out.println("Qtd Alunos: ");
        quantidadeAlunos = sc.nextInt();
        System.out.println("Turma: ");
        turma = sc.next();
        System.out.println("Mensalidade: ");
        mensalidade = sc.nextFloat();
    }

    public void imprimeDados() {
        System.out.println("--- Dados do Curso ---");
        System.out.println("Curso: " + nome);
        System.out.println("Qtd Alunos: " + quantidadeAlunos);
        System.out.println("Turma: " + turma);
        System.out.println("Mensalidade: " + mensalidade);
        System.out.println("Total Mensalidade: "+ calculaTotalMensalidade());
    }

    public float calculaTotalMensalidade() {
        return quantidadeAlunos * mensalidade;
    }
}
