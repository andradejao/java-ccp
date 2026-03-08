package exercicio;

public class Exercicio {

    public static void main(String[] args) {

        Cliente cli = new Cliente();
        Curso cur = new Curso("Medicina", "Ortopedia", "Manoel Pereira");  
        
        cli.nome = "Pedro da Silva";
        cli.idade = 22;
        cli.sexo = "Masculino";
        
        cli.exibirDados();
        cur.exibirDadosCurso();
    }

}
