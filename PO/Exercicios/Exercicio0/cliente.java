package exercicio;

public class Cliente {

    String nome;
    int idade;
    String sexo;

    public Cliente() {
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
    }
}
