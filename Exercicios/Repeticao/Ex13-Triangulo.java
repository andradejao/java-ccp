package com.mycompany.triangulo;

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para desenhar o triângulo: ");
        int numero = sc.nextInt();

        for (int i = numero; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
