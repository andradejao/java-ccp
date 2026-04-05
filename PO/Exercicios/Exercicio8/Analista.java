package main;

public class Analista extends Empregado {

    float[] valorPorProjeto;

    public Analista() {
    }

    public Analista(String nome, String matricula, float[] valorPorProjeto) {
        super(nome, matricula); // Chamando o constructor da classe pai
        this.valorPorProjeto = valorPorProjeto;
    }

    @Override // boa prática. evita alguns erros
    public float calculaSalario() {
        float soma = 0;
        for (float valor : valorPorProjeto) {
            soma += valor;
        }
        return soma;
    }
}
