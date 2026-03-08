Package exercicio1;

// Criando a classe
public class Paciente {

    String nome;
    String rg;
    String endereco;
    String telefone;
    String dataNascimento;
    String profissao;

//    Construtor vazio
    public Paciente() {
    }

    public Paciente(String nome) {
        this.nome = nome;
    }

//    Função para exibir os dados coletados
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("RG: " + rg);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Profissão: " + profissao);
    }
}
