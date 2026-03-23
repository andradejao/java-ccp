package exercicio;

public class Exercicio5 {

    public static void main(String[] args) {
        Curso c1 = new Curso();
        Curso c2 = new Curso("Medicina", 45, "B", 2350f);

        c1.cadastraCurso();

        c1.imprimeDados();
        c2.imprimeDados();
    }

}
