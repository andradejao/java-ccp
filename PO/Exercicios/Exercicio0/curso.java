package exercicio;

public class Curso {

    String area;
    String nome;
    String professor;

    public Curso(String area, String nome, String professor) {
        this.area = area;
        this.nome = nome;
        this.professor = professor;
    }

    public void exibirDadosCurso() {
        System.out.println("Area: " + area);
        System.out.println("Nome: " + nome);
        System.out.println("Professor: " + professor);
    }
}
