package com.mycompany.ex6.desconto;

import java.util.Scanner;

public class Ex6Desconto {

    public static void main(String[] args) {
        double valor;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        valor = sc.nextDouble();

        calcularDesconto(valor);
    }

    public static void calcularDesconto(double valor) {
        double desconto = valor * 0.09;
        double valorComDesconto = valor - desconto;
        System.out.print("O valor do produto com desconto de 9% é: R$" + valorComDesconto);
    }
}
