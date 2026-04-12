package testafuncionario;

public abstract class Funcionario {

    String nome;
    String cpf;
    double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public boolean autentica() {
        return false; // Caixa não tem autentica.
    }

    public abstract double bonificacao();
}
