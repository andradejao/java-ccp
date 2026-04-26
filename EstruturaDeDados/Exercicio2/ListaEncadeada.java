package listaencadeada;

import java.util.LinkedList;

public class ListaEncadeada {

    public static void main(String[] args) {
//        Criando a lista encadeada para objeto Pacote
        LinkedList<Pacote> listaPacotes = new LinkedList<>();

//       Adicionando todos os cinco pacotes manualmente
        System.out.println("--- Lista Pacotes ---");
        listaPacotes.add(new Pacote(101, "São Paulo"));
        listaPacotes.add(new Pacote(102, "Rio de Janeiro"));
        listaPacotes.add(new Pacote(103, "Belo Horizonte"));
        listaPacotes.add(new Pacote(104, "Curitiba"));
        listaPacotes.add(new Pacote(105, "Porto Alegre"));

//       Laço ForEach para percorrer toda a lista sem precisar controlar o índice
//       e imprimir os valores cadastrados
        for (Pacote p : listaPacotes) {
            System.out.println(p); // Aqui o método sobreescrito toString será chamado naturalmente
        }
//        Remover um pacote específico, informando o codigoPacote.
        int removerPacote = 103;
//        Loop para percorrer a lista buscando o pacote desejado,
//        ao encontrar o valor desejado, o remove da lista
        for (int i = 0; i < listaPacotes.size(); i++) {
            if (listaPacotes.get(i).codigoPacote == removerPacote) {
                listaPacotes.remove(i);
                break; // interrompe o loop. evita bugs.
            }
        }

//       Verificar se existe algum pacote destinado a uma cidade informada.
        String cidadeInformada = "Curitiba";
        boolean existePacote = false;
//       Percorre a lista em um ForEach e compara se é igual (ignora case-sensitive),
//       se encontrar, torna true
        for (Pacote p : listaPacotes) {
            if (p.cidadeDestino.equalsIgnoreCase(cidadeInformada)) {
                existePacote = true;
                break; // interrompe o loop. evita bugs.
            }
        }
//        Imprime o valor true ou false
        System.out.println("\nPacote para " + cidadeInformada + " existe? " + existePacote);

//        Ordenar a lista de pacotes em ordem alfabética pela cidadeDestino.
//        Não utilizar TreeSet, Map ou estruturas prontas de ordenação automática (Sort)
//        Loop para ordenar a lista
        for (int i = 0; i < listaPacotes.size() - 1; i++) {
            // Compara o pacote com o próximo
            for (int j = 0; j < listaPacotes.size() - 1 - i; j++) {
                // Se estiver fora de ordem, troca
                if (listaPacotes.get(j).cidadeDestino.compareToIgnoreCase(listaPacotes.get(j + 1).cidadeDestino) > 0) {
                    Pacote temp = listaPacotes.get(j);
                    listaPacotes.set(j, listaPacotes.get(j + 1));
                    listaPacotes.set(j + 1, temp);
                }
            }
        }
//        Exibir todos os pacotes após a ordenação.
//        Exibir a quantidade total de pacotes restantes na lista
        System.out.println("\n--- Lista Ordenada ---");
        for (Pacote p : listaPacotes) {
            System.out.println(p);
        }
        System.out.println("\nTotal de pacotes: " + listaPacotes.size());
    }
}
