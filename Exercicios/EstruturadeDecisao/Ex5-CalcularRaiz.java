package com.mycompany.exercicio5;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio5 {

    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        a = sc.nextDouble();

        System.out.print("Digite o valor de b: ");
        b = sc.nextDouble();

        System.out.print("Digite o valor de c: ");
        c = sc.nextDouble();

        delta = (b * b) - 4 * a * c;

        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("Delta: " + delta);
            System.out.println("1ª Raiz: " + x1);
            System.out.println("2ª Raiz: " + x2);
        } else {
            System.out.println("O cálculo não poderá ser feito porque delta " + delta + " não é um valor positivo.");
        }
    }
}
