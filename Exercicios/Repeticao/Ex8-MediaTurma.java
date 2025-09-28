package com.mycompany.notasturma;

import java.util.Scanner;

public class NotasTurma {

    public static void main(String[] args) {
        int totalNotas = 80;
        int aprovados = 0;
        double soma = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= totalNotas; i++) {
            double nota;
            do {
                System.out.print("Digite a nota do aluno " + i + " (0 a 10): ");
                nota = sc.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                }
            } while (nota < 0 || nota > 10);

            soma += nota;
            if (nota >= 6.0) {
                aprovados++;
            }
        }

        double media = soma / totalNotas;
        System.out.println("Quantidade de alunos aprovados: " + aprovados);
        System.out.printf("Média da turma: " + media);
    }
}
