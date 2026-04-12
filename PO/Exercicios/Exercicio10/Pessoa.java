package testapessoa;

public abstract class Pessoa {

    private String nome;

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String mostraClasse();
}
