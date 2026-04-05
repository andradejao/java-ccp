package main;

public abstract class Empregado {

    protected String nome;
    protected String matricula;

    public Empregado() {
    }

    public Empregado(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public abstract float calculaSalario();
}
