package com.mycompany.ex2.area;

import java.util.Scanner;

public class Ex2Area {

    public static void main(String[] args) {
        double lado1, lado2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro lado do retângulo: ");
        lado1 = sc.nextDouble();

        System.out.print("Digite o segundo lado do retângulo: ");
        lado2 = sc.nextDouble();

        System.out.print("O valor da area é: " + calcularArea(lado1, lado2));
    }

    public static double calcularArea(double lado1, double lado2) {
        double area = lado1 * lado2;
        return area;
    }
}
