package testapessoa;

public class Aluno extends Pessoa {
    private String rgm;

    public Aluno() {
    }
    
    @Override
    public String mostraClasse(){
        return "Aluno";
    }
}
