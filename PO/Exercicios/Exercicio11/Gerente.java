package testafuncionario;

public class Gerente extends Funcionario {

    int senha;
    int funcionariosGerenciados;

    public Gerente() {
    }

    public Gerente(int senha, int funcionariosGerenciados, String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.senha = senha;
        this.funcionariosGerenciados = funcionariosGerenciados;
    }

    @Override
    public boolean autentica() {
        boolean acessado;
        if (senha == 123) {
            acessado = true;
        } else {
            acessado = false;
        }
        return acessado;
    }

    @Override
    public double bonificacao() {
        return salario * 0.15;
    }

}
