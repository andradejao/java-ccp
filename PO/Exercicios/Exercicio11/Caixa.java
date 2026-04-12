package testafuncionario;

public class Caixa extends Funcionario {

    public Caixa() {
    }

    @Override
    public double bonificacao() {
        return salario * 0.10;
    }
}
