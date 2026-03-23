package exercicio6;

import java.util.Scanner;

public class Paciente {

    String nome;
    String rg;
    String endereco;
    String telefone;
    int anoNascimento;
    String profissao;

    public Paciente() {
    }

    public Paciente(String nome, String rg, String endereco, String telefone, int anoNascimento, String profissao) {
        this.nome = nome;
        this.rg = rg;
        this.endereco = endereco;
        this.telefone = telefone;
        this.anoNascimento = anoNascimento;
        this.profissao = profissao;
    }

    public void cadastraDados() {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cadastro Paciente ---\n");
        System.out.println("Nome: ");
        nome = sc.nextLine();
        System.out.println("RG: ");
        rg = sc.nextLine();
        System.out.println("Endereco: ");
        endereco = sc.nextLine();
        System.out.println("Telefone: ");
        telefone = sc.nextLine();
        System.out.println("Ano Nascimento: ");
        anoNascimento = sc.nextInt();
        sc.nextLine();
        System.out.println("Profissao: ");
        profissao = sc.nextLine();
    }

    public void imprimeDados() {
        System.out.println("--- Paciente Cadastrado ---\n");
        System.out.println("Nome: " + nome);
        System.out.println("RG: " + rg);
        System.out.println("Endereco: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Ano Nascimento: " + anoNascimento);
        System.out.println("Profissao: " + profissao);
    }

    public int calculaIdade(int anoAtual) {
        return anoAtual - anoNascimento;
    }
}
