package com.mycompany.jogosorteio;

import java.util.Random;
import java.util.Scanner;

public class JogoSorteio {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int numeroSecreto = random.nextInt(101); // Sorteia o número de 0-100
        int tentativa = 0;
        int chute;

        System.out.println("Tente acertar o número escolhido entre 0 e 100!!!");

        do {
            System.out.println("Digite seu chute!");
            chute = sc.nextInt();
            tentativa++;

            if (chute < numeroSecreto) {
                System.out.println("O número é maior!");
            } else if (chute > numeroSecreto) {
                System.out.println("O número é menor!");
            } else {
                System.out.println("Parabéns!!! Você acertou em " + tentativa + " tentativas.");
            }

        } while (chute != numeroSecreto);
    }
}
