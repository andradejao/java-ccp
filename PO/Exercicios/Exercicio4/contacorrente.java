package banco;

public class ContaCorrente {

    String nome;
    float saldo;
    float limite;
    char tipo;

    public ContaCorrente() {
    }

    public ContaCorrente(String n, float s, float l, char t) {
        this.nome = n;
        this.saldo = s;
        this.limite = l;
        this.tipo = t;
    }

    public ContaCorrente(String n, float s, char t) {
        this.nome = n;
        this.saldo = s;
        this.tipo = t;
    }

    public void cadastraDados(String n, float s, float l, char t) {
        this.nome = n;
        this.saldo = s;
        this.limite = l;
        this.tipo = t;
    }

    public String imprimeDados() {
        return "Nome: " + nome + "\nSaldo: " + saldo + "\nLimite: " + limite + "\nTipo: " + tipo;
    }

    public void depositar(float valor) {
        saldo += valor;
    }

    public void sacar(float valor) {
        saldo -= valor;
    }
}
