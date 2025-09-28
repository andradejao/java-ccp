package com.mycompany.positivonegativo;

import java.util.Scanner;

public class PositivoNegativo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorPositivo = 0;
        int contadorNegativo = 0;
        String valor;
        double menorValor = Double.POSITIVE_INFINITY; // Permitir a entrada de qualquer valor

        do {
            System.out.println("Digite os valores reais (ou fim para finalizar): ");
            valor = sc.next();
            if (!valor.equalsIgnoreCase("fim")) {
                if (Double.parseDouble(valor) < 0) {
                    contadorNegativo++;
                } else {
                    contadorPositivo++;
                }
                if (Double.parseDouble(valor) < menorValor) {
                    menorValor = Double.parseDouble(valor);
                }
            }
        } while (!valor.equalsIgnoreCase("fim"));
        System.out.println("São " + contadorPositivo + " valores positivos e " + contadorNegativo + " negativos");
        System.out.println("O menor valor é: " + menorValor);
    }
}
