package com.mycompany.mediadowhile;

import java.util.Scanner;

public class MediaDoWhile {

    public static void main(String[] args) {
        double soma = 0;
        int i = 0;
        double valor = 0;
        double media = 0;
        double maior = Double.NEGATIVE_INFINITY; // para aceitar qualquer valor digitado
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Digite o valor para calcular a média (ou -1 para finalizar):");
            valor = sc.nextDouble();
            if (valor != -1) {
                soma += valor;
                i++;
                if (valor > maior) {
                    maior = valor;
                }
            }
        } while (valor != -1);
        if (i == 0) {
            System.out.println("Nenhum valor foi digitado");
            return;
        } else {
            media = soma / i;
            System.out.println("A média dos valores é: " + media);
            System.out.println("O maior valor é: " + maior);
        }

    }
}
