package com.mycompany.ex4.raiz;

import java.util.Scanner;

public class Ex4Raiz {

    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        a = sc.nextDouble();
        System.out.print("Digite o valor de b: ");
        b = sc.nextDouble();
        System.out.print("Digite o valor de c: ");
        c = sc.nextDouble();

        delta = getDelta(a, b, c);

        // Verificação para saber se há raízes reais
        if (delta >= 0) {
            x1 = getX1(a, b, delta);
            x2 = getX2(a, b, delta);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            System.out.println("O valor de delta " + delta + " é negativo. Não existem raízes reais.");
        }

    }

    // Função para calcular delta
    public static double getDelta(double a, double b, double c) {
        return (b * b) - 4 * a * c;
    }

    // Função para calcular x1
    public static double getX1(double a, double b, double delta) {
        return (-b + Math.sqrt(delta)) / (2 * a);
    }

    // Função para calcular x2
    public static double getX2(double a, double b, double delta) {
        return (-b - Math.sqrt(delta)) / (2 * a);
    }
}
