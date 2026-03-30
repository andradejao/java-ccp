package Main;

public class Main {

    public static void main(String[] args) {
        String[] paises = {"México", "Brasil", "Cuba", "Chile", "Argentina", "Espanha"};
        String[] pessoas = {"Pedro", "Valéria", "Ana", "Luiz", "Zoe", "Miguel"};
        String[] teste = {"Brasil", "áustria", "México", "CHILE", "Zâmbia", "Portugal"};

        System.out.println("--- Paises Antes ---");
        visualizar(paises);

        int trocaPaises = BubbleSortStrings.ordenarPaises(paises);

        System.out.println("--- Paises Depois ---");
        visualizar(paises);
        System.out.println("Total de Trocas: " + trocaPaises);

        System.out.println("\n--- Pessoas Antes ---");
        visualizar(pessoas);

        int trocaPessoas = BubbleSortStrings.ordenarPessoas(pessoas);

        System.out.println("--- Pessoas Depois ---");
        visualizar(pessoas);
        System.out.println("Total de Trocas: " + trocaPessoas);

        System.out.println("\n--- Teste Antes ---");
        visualizar(teste);

        int trocaTeste = BubbleSortStrings.ordenarPaises(teste);

        System.out.println("--- Teste Depois ---");
        visualizar(teste);
        System.out.println("Total de Trocas: " + trocaTeste);
// Nesse vetor os acentos afetaram a ordem mesmo usando o compareToIgnoreCase()

    }

    public static void visualizar(String vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "   ");
        }
        System.out.println();
    }
// String.compareToIgnoreCase() - Método para comparar duas Strings em ordem alfabética e
// ignora Case Sensitive.
// String.compareTo() - Método para comparar duas Strigs em ordem alfabética e é
// Case Sensitive.
// Como o Bubble Sort troca referências de Strings - No Bubble Sort ocorre a troca
// das posições das referências no Array.
    
// PEQUENO RELATÓRIO: 
// 1. Por que compareToIgnoreCase é mais adequado para nomes de pessoas/países em português?
// R: É melhor porque ele ignora maiúsculas e minúsculas, deixando a ordem mais correta para nomes. 
// “Ana” e “ana” são o mesmo nome, então não faz sentido separar eles na ordenação.
    
// 2. O que aconteceria se você usasse compareTo normal com “Valéria” e “ana”?
// R: Se usasse dessa forma, seria considerado CaseSensitive. Então, Valéria viria antes de ana.
    
// 3. Qual foi a quantidade de trocas em cada vetor? Por que um vetor precisou de mais trocas que o outro?
// R: O vetor países teve 9 trocas e pessoas 7. Isso acontece porque quanto mais bagunçado,
// mais trocas precisa fazer até deixar tudo na ordem certa.
}

