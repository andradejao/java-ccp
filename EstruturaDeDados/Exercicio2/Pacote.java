package listaencadeada;

public class Pacote {

    int codigoPacote;
    String cidadeDestino;

    public Pacote(int codigoPacote, String cidadeDestino) {
        this.codigoPacote = codigoPacote;
        this.cidadeDestino = cidadeDestino;
    }

//   Método para retornar os valores formatados como String.
//   Sem ele, retornaria o valor da localização de memória.
    @Override // Sobreescreve o método toString já existente para que retorne o valor desejado
    public String toString() {
        return "Código: " + codigoPacote + " - Destino: " + cidadeDestino;
    }
}
