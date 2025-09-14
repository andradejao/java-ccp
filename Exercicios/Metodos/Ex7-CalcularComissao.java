package com.mycompany.ex7.pregos;

import java.util.Locale;
import java.util.Scanner;

public class Ex7Pregos {

    public static void main(String[] args) {
        int telheiro, quadrado;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de Telheiros vendidos: ");
        telheiro = sc.nextInt();

        System.out.print("Digite a quantidade de Quadrados vendidos: ");
        quadrado = sc.nextInt();

        double valorTotal = calcularValor(telheiro, quadrado);

        System.out.println("O valor total da venda dos pregos é: R$" + valorTotal);

//        Formatando para duas casas decimais
        String valorComissaoFormatado = String.format(Locale.US, "%.2f", calcularComissao(valorTotal));

        System.out.println("O valor da comissão é: R$" + valorComissaoFormatado);
    }

    public static double calcularValor(int telheiro, int quadrado) {
        double valorTelheiro = telheiro * 1.05;
        double valorQuadrado = quadrado * 0.51;
        double valorTotal = valorTelheiro + valorQuadrado;

//      Chamando a função para calcular a comissão
        calcularComissao(valorTotal);
        return valorTotal;
    }

    public static double calcularComissao(double valorTotal) {
        return valorTotal * 0.10;
    }
}
