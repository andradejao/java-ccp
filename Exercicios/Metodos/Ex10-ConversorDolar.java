package com.mycompany.ex10.dolar;

import java.util.Locale;
import java.util.Scanner;

public class Ex10Dolar {

    public static void main(String[] args) {
        double valor, cotacao;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor em reais: ");
        valor = sc.nextDouble();

        System.out.print("Digite a cotação atual do dolar: ");
        cotacao = sc.nextDouble();

        String dolarFormatado = String.format(Locale.US, "%.2f", converteDolar(valor, cotacao));

        System.out.println("Valor convertido em USD: $" + dolarFormatado);
    }

    public static double converteDolar(double valor, double cotacao) {
        return valor / cotacao;
    }
}
