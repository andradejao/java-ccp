package Main;

public class BubbleSortStrings {

    public static int ordenarPaises(String[] paises) {
        int trocas = 0;
        for (int i = 0; i < paises.length - 1; i++) {
            for (int j = 0; j < paises.length - 1 - i; j++) {

                // Por que usamos compareToIgnoreCase aqui?
                // Para ignorar as letras maiúsculas/minúsculas na hora de ordenar
                if (paises[j].compareToIgnoreCase(paises[j + 1]) > 0) {

                    String tmp = paises[j];
                    paises[j] = paises[j + 1];
                    paises[j + 1] = tmp;

                    trocas++;
                }
            }
        }

        return trocas;
    }

    public static int ordenarPessoas(String[] pessoas) {
        int trocas = 0;
        for (int i = 0; i < pessoas.length - 1; i++) {
            for (int j = 0; j < pessoas.length - 1 - i; j++) {
                
                // Por que usamos compareToIgnoreCase aqui?
                // Para ignorar as letras maiúsculas/minúsculas na hora de ordenar
                if (pessoas[j].compareToIgnoreCase(pessoas[j + 1]) > 0) {

                    String tmp = pessoas[j];
                    pessoas[j] = pessoas[j + 1];
                    pessoas[j + 1] = tmp;

                    trocas++;
                }
            }
        }

        return trocas;
    }
}
