package com.mycompany.exercicio3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        double valor;
        int tempo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da bolsa: ");
        valor = sc.nextDouble();

        System.out.print("Digite o tempo de estagio em meses: ");
        tempo = sc.nextInt();

        if (valor >= 750.00 && valor <= 950.00 && tempo >= 24) {
            System.out.println("Participara do treinamento!");
        } else {
            System.out.println("Nao participara do treinamento!");
        }
    }
    }
