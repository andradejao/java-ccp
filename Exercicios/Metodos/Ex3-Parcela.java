package com.mycompany.ex3.parcela;

import java.util.Scanner;

public class Ex3Parcela {

    public static void main(String[] args) {
        double valor;
        int parcela;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        valor = sc.nextDouble();

        System.out.print("Digite a quantidade de parcelas: ");
        parcela = sc.nextInt();

        System.out.print("O valor da parcela com 5% de juros aplicado é: R$" + calcularParcela(valor, parcela));

    }

    public static double calcularParcela(double valor, int parcela) {
        double juros = valor * 1.05;
        double valorParcelado = juros / parcela;
        return valorParcelado;
    }
}
