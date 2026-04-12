package testapessoa;

public class Professor extends Pessoa {

    private int matricula;
    private String campus;

    public Professor() {
    }

    @Override
    public String mostraClasse() {
        return "Professor";
    }
}
