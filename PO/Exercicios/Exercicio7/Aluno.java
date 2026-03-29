package projetoexercicioaula05;

public class Aluno {

    private int rgm;
    private String nome;
    private float valorMensalidade;
    private int anoNascimento;

    public Aluno() {
    }

    public Aluno(int rgm, String nome, float valorMensalidade, int anoNascimento) {
        this.rgm = rgm;
        this.nome = nome;
        this.valorMensalidade = valorMensalidade;
        this.anoNascimento = anoNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int getRgm() {
        return rgm;
    }

    public void setRgm(int rgm) {
        this.rgm = rgm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(float valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }

    public int calculoIdade(int anoCorrente) {
        return anoCorrente - anoNascimento;
    }
}
