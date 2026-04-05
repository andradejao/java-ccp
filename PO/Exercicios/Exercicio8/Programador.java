package main;

public class Programador extends Empregado {

    float quantidadeHoras;
    float valorHora;

    public Programador() {
    }

    public Programador(float quantidadeHoras, float valorHora, String nome, String matricula) {
        super(nome, matricula);
        this.quantidadeHoras = quantidadeHoras;
        this.valorHora = valorHora;
    }

    @Override
    public float calculaSalario() {
        return valorHora * quantidadeHoras;
    }
}
