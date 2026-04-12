package testapessoa;

public class Funcionario extends Pessoa {

    private int matricula;
    private String setor;

    public Funcionario() {
    }

    @Override
    public String mostraClasse() {
        return "Funcionário";
    }
}
