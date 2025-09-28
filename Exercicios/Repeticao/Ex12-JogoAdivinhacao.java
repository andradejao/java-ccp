package com.mycompany.jogoadivinhacao;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int min = 0;
        int max = 100;
        int chute;
        String resposta;
        int tentativas = 0;

        System.out.println("Pense em um número entre 0 e 100");
        System.out.println("Responda com: maior, menor ou acertou.");

        do {
            chute = random.nextInt(max - min + 1) + min; // gera entre min e max
            tentativas++;
            System.out.println("Meu chute é: " + chute);

            resposta = sc.next();

            if (resposta.equalsIgnoreCase("maior")) {
                min = chute + 1; // ajusta intervalo
            } else if (resposta.equalsIgnoreCase("menor")) {
                max = chute - 1;
            } else if (!resposta.equalsIgnoreCase("acertou")) {
                System.out.println("Digite apenas 'maior', 'menor' ou 'acertou'!");
            }

        } while (!resposta.equalsIgnoreCase("acertou"));

        System.out.println("Eu acertei em " + tentativas + " tentativas!");
    }
}

